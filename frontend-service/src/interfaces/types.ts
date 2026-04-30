export interface ICategory {
    id: number;
    nome: string;
}

export interface IResource {
    id: number;
    nome: string;
    descrizione: string;
    url: string;
    category: ICategory;
    dataInserimento: string;
}