import React, { createContext, useState, useEffect, ReactNode } from "react";

type ProjectContextType = {
    projectId: number | null;
    setProjectId: (id: number | null) => void;
};

export const ProjectContext = createContext<ProjectContextType>({
    projectId: null,
    setProjectId: () => {},
});

export const ProjectContextProvider: React.FC<{ children: ReactNode }> = ({ children }) => {
    // Carica il valore iniziale dal localStorage se presente
    const [projectId, setProjectIdState] = useState<number | null>(() => {
        const saved = localStorage.getItem("selectedProjectId");
        return saved ? parseInt(saved, 10) : null;
    });

    // Funzione per aggiornare sia lo stato che il localStorage
    const setProjectId = (id: number | null) => {
        setProjectIdState(id);
        if (id) {
            localStorage.setItem("selectedProjectId", id.toString());
        } else {
            localStorage.removeItem("selectedProjectId");
        }
    };

    return (
        <ProjectContext.Provider value={{ projectId, setProjectId }}>
            {children}
        </ProjectContext.Provider>
    );
};