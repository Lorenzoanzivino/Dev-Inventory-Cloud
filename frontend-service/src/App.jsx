import React, { useContext, useEffect, useState } from 'react';
import { Routes, Route, Navigate, Link } from 'react-router-dom';
import { AuthContext } from './context/AuthContext';
import Login from './pages/Login';
import Register from './pages/Register';
import { catalogService } from './api/catalogService';
import { developerService } from './api/developerService';
import { jwtDecode } from "jwt-decode";
import axiosInstance from './api/axiosInstance';

const Dashboard = () => {
    const { logout, token } = useContext(AuthContext);
    const [resources, setResources] = useState([]);
    const [categories, setCategories] = useState([]);
    const [myCollection, setMyCollection] = useState([]);
    const [selectedCategory, setSelectedCategory] = useState('');
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);
    const [message, setMessage] = useState('');
    const [activeTab, setActiveTab] = useState('catalog'); // 'catalog' o 'collection'

    // Form states
    const [newCategoryName, setNewCategoryName] = useState('');
    const [newResource, setNewResource] = useState({ nome: '', descrizione: '', url: '', categoryId: '' });

    // Estrai email e prova a dedurre l'ID utente/developer
    // Nota: in un'app di produzione vera, l'endpoint /auth/login o un endpoint /me restituirebbe l'ID esatto.
    // Per ora, assumiamo che l'ID developer corrisponda all'ID decodificato o useremo 1 come default per i test.
    let developerId = 1;
    try {
        if(token) {
            const decoded = jwtDecode(token);
            // Se hai aggiunto un claim specifico nel backend, lo leggi qui.
            // Altrimenti assumiamo che il developer service assegni ID incrementali.
            // Per ora usiamo ID fisso 1 (quello che abbiamo fittiziamente per Lorenzo/Giuseppe).
            developerId = 1;
        }
    } catch(e) {}

    const fetchData = async () => {
        setLoading(true);
        setError(null);
        try {
            const [resData, catData, colData] = await Promise.all([
                catalogService.getAllResources(),
                catalogService.getAllCategories(),
                developerService.getDeveloperById(developerId).catch(() => ({ items: [] })) // Ignora errore se collection è vuota
            ]);
            setResources(resData);
            setCategories(catData);
            setMyCollection(colData.items || []);
        } catch (err) {
            setError('Errore durante il caricamento dei dati dal server.');
        } finally {
            setLoading(false);
        }
    };

    useEffect(() => {
        fetchData();
    }, []);

    const handleCreateCategory = async (e) => {
        e.preventDefault();
        try {
            await catalogService.createCategory(newCategoryName);
            setNewCategoryName('');
            setMessage('Categoria creata!');
            setTimeout(()=> setMessage(''), 3000);
            fetchData();
        } catch (err) {
            setError('Errore nella creazione della categoria.');
        }
    };

    const handleCreateResource = async (e) => {
        e.preventDefault();
        try {
            await catalogService.createResource(newResource);
            setNewResource({ nome: '', descrizione: '', url: '', categoryId: '' });
            setMessage('Risorsa creata!');
            setTimeout(()=> setMessage(''), 3000);
            fetchData();
        } catch (err) {
            setError('Errore nella creazione della risorsa.');
        }
    };

    const handleToggleCollection = async (resourceId, isSaved) => {
        try {
            if (isSaved) {
                // Rimuovi
                await axiosInstance.delete(`/collections/${developerId}/${resourceId}`);
                setMessage('Risorsa rimossa dalla collezione.');
            } else {
                // Aggiungi
                await axiosInstance.post('/collections', { developerId, resourceId });
                setMessage('Risorsa salvata nella tua collezione!');
            }
            setTimeout(()=> setMessage(''), 3000);
            fetchData(); // Ricarica per aggiornare le icone/liste
        } catch (err) {
            setError(err.response?.data?.message || 'Errore durante l\'aggiornamento della collezione.');
            setTimeout(()=> setError(null), 3000);
        }
    };

    const filteredResources = selectedCategory
        ? resources.filter(r => r.category && r.category.id.toString() === selectedCategory)
        : resources;

    const isResourceSaved = (resId) => {
        return myCollection.some(item => item.resourceId === resId);
    };

    return (
        <div className="min-h-screen bg-gray-100 p-4 md:p-8">
            <div className="max-w-6xl mx-auto">
                {/* HEADER */}
                <div className="flex justify-between items-center bg-white p-6 rounded-lg shadow-md mb-6">
                    <h1 className="text-2xl md:text-3xl font-bold text-blue-600">Dev-Inventory Cloud</h1>
                    <button onClick={logout} className="bg-red-500 text-white px-4 py-2 rounded-md hover:bg-red-600 transition">
                        Logout
                    </button>
                </div>

                {/* MESSAGGI */}
                {message && <div className="bg-green-100 text-green-700 p-3 rounded mb-4 shadow">{message}</div>}
                {error && <div className="bg-red-100 text-red-700 p-3 rounded mb-4 shadow">{error}</div>}

                {/* NAVIGAZIONE TABS */}
                <div className="flex gap-4 mb-6">
                    <button
                        onClick={() => setActiveTab('catalog')}
                        className={`px-6 py-3 rounded-lg font-semibold transition ${activeTab === 'catalog' ? 'bg-blue-600 text-white shadow-md' : 'bg-white text-gray-600 hover:bg-gray-50'}`}
                    >
                        Esplora Catalogo
                    </button>
                    <button
                        onClick={() => setActiveTab('collection')}
                        className={`px-6 py-3 rounded-lg font-semibold transition ${activeTab === 'collection' ? 'bg-blue-600 text-white shadow-md' : 'bg-white text-gray-600 hover:bg-gray-50'}`}
                    >
                        Le Mie Risorse ({myCollection.length})
                    </button>
                </div>

                {activeTab === 'catalog' && (
                    <>
                        {/* FORM INSERIMENTO (Visibile solo nel catalogo) */}
                        <div className="grid grid-cols-1 md:grid-cols-2 gap-6 mb-6">
                            <div className="bg-white p-6 rounded-lg shadow-md border-t-4 border-blue-500">
                                <h2 className="text-lg font-bold mb-4 text-gray-700">Aggiungi Categoria</h2>
                                <form onSubmit={handleCreateCategory} className="flex gap-2">
                                    <input type="text" placeholder="Nome" className="border p-2 rounded flex-1 focus:ring-2 focus:ring-blue-200 outline-none" value={newCategoryName} onChange={(e) => setNewCategoryName(e.target.value)} required />
                                    <button type="submit" className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700">Salva</button>
                                </form>
                            </div>

                            <div className="bg-white p-6 rounded-lg shadow-md border-t-4 border-green-500">
                                <h2 className="text-lg font-bold mb-4 text-gray-700">Aggiungi Risorsa Tech</h2>
                                <form onSubmit={handleCreateResource} className="flex flex-col gap-3">
                                    <input type="text" placeholder="Nome Tool (es. Docker)" className="border p-2 rounded focus:ring-2 outline-none" value={newResource.nome} onChange={(e) => setNewResource({...newResource, nome: e.target.value})} required />
                                    <input type="text" placeholder="Breve descrizione" className="border p-2 rounded focus:ring-2 outline-none" value={newResource.descrizione} onChange={(e) => setNewResource({...newResource, descrizione: e.target.value})} />
                                    <input type="url" placeholder="https://..." className="border p-2 rounded focus:ring-2 outline-none" value={newResource.url} onChange={(e) => setNewResource({...newResource, url: e.target.value})} required />
                                    <div className="flex gap-2">
                                        <select className="border p-2 rounded flex-1 focus:ring-2 outline-none" value={newResource.categoryId} onChange={(e) => setNewResource({...newResource, categoryId: e.target.value})} required>
                                            <option value="">Seleziona Categoria</option>
                                            {categories.map(c => <option key={c.id} value={c.id}>{c.nome}</option>)}
                                        </select>
                                        <button type="submit" className="bg-green-600 text-white px-4 py-2 rounded hover:bg-green-700">Salva</button>
                                    </div>
                                </form>
                            </div>
                        </div>

                        {/* LISTA CATALOGO */}
                        <div className="bg-white p-6 rounded-lg shadow-md">
                            <div className="flex flex-col md:flex-row justify-between items-start md:items-center mb-6 gap-4 border-b pb-4">
                                <h2 className="text-2xl font-bold text-gray-800">Tutte le Risorse</h2>
                                <select className="border p-2 rounded bg-gray-50 focus:ring-2 outline-none min-w-[200px]" value={selectedCategory} onChange={(e) => setSelectedCategory(e.target.value)}>
                                    <option value="">Tutte le categorie</option>
                                    {categories.map(c => <option key={c.id} value={c.id}>{c.nome}</option>)}
                                </select>
                            </div>

                            {loading ? <p className="text-gray-500 animate-pulse">Caricamento...</p> : filteredResources.length === 0 ? <p className="text-gray-500 italic">Nessuna risorsa trovata.</p> : (
                                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                                    {filteredResources.map((res) => {
                                        const saved = isResourceSaved(res.id);
                                        return (
                                            <div key={res.id} className="border rounded-lg p-5 hover:shadow-xl transition duration-200 bg-gray-50 relative group">
                                                <button
                                                    onClick={() => handleToggleCollection(res.id, saved)}
                                                    className={`absolute top-4 right-4 p-2 rounded-full shadow-sm transition ${saved ? 'bg-yellow-400 text-white hover:bg-yellow-500' : 'bg-gray-200 text-gray-500 hover:bg-gray-300'}`}
                                                    title={saved ? "Rimuovi dalla collezione" : "Aggiungi alla collezione"}
                                                >
                                                    ★
                                                </button>
                                                <h3 className="text-xl font-bold text-gray-800 mb-1 pr-8">{res.nome}</h3>
                                                {res.category && <span className="inline-block bg-blue-100 text-blue-800 text-xs px-2 py-1 rounded-full mb-3">{res.category.nome}</span>}
                                                <p className="text-gray-600 mb-4 text-sm h-10 overflow-hidden">{res.descrizione}</p>
                                                <a href={res.url} target="_blank" rel="noopener noreferrer" className="text-sm font-semibold text-blue-600 hover:text-blue-800 flex items-center gap-1">
                                                    Apri Link ↗
                                                </a>
                                            </div>
                                        )})}
                                </div>
                            )}
                        </div>
                    </>
                )}

                {activeTab === 'collection' && (
                    <div className="bg-white p-6 rounded-lg shadow-md">
                        <h2 className="text-2xl font-bold text-gray-800 border-b pb-4 mb-6">Le tue Risorse Preferite</h2>
                        {loading ? <p className="text-gray-500 animate-pulse">Caricamento...</p> : myCollection.length === 0 ? <p className="text-gray-500 italic">Non hai ancora salvato nulla nella tua collezione.</p> : (
                            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                                {myCollection.map((item) => (
                                    <div key={item.id} className="border-l-4 border-yellow-400 bg-white shadow-sm rounded-r-lg p-5 relative">
                                        <button
                                            onClick={() => handleToggleCollection(item.resourceId, true)}
                                            className="absolute top-4 right-4 text-red-400 hover:text-red-600 text-sm font-semibold"
                                        >
                                            Rimuovi ✖
                                        </button>
                                        <h3 className="text-lg font-bold text-gray-800 mb-2 pr-16">{item.resourceName}</h3>
                                        <a href={item.resourceUrl} target="_blank" rel="noopener noreferrer" className="text-sm font-semibold text-blue-600 hover:text-blue-800">
                                            Apri Link ↗
                                        </a>
                                    </div>
                                ))}
                            </div>
                        )}
                    </div>
                )}
            </div>
        </div>
    );
};

const ProtectedRoute = ({ children }) => {
    const { isAuthenticated } = useContext(AuthContext);
    return isAuthenticated ? children : <Navigate to="/login" />;
};

function App() {
    return (
        <Routes>
            <Route path="/login" element={<Login />} />
            <Route path="/register" element={<Register />} />
            <Route path="/" element={<ProtectedRoute><Dashboard /></ProtectedRoute>} />
        </Routes>
    );
}

export default App;