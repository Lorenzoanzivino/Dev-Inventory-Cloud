// src/contexts/ProjectContext.tsx
import React, { createContext, useState, ReactNode } from "react";

type ProjectContextType = {
    projectId: number | null;
    setProjectId: (id: number | null) => void;
};

export const ProjectContext = createContext<ProjectContextType>({
    projectId: null,
    setProjectId: () => {},
});

export const ProjectContextProvider: React.FC<{ children: ReactNode }> = ({ children }) => {
    const [projectId, setProjectId] = useState<number | null>(null);

    return (
        <ProjectContext.Provider value={{ projectId, setProjectId }}>
            {children}
        </ProjectContext.Provider>
    );
};