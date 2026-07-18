export interface IProject {
    id: number;
    nome: string;
    descrizione: string;
}

export interface ICategory {
    id: number;
    nome: string;
    projectId?: number;
}

export interface IResource {
    id: number;
    nome: string;
    descrizione: string;
    url: string;
    category: ICategory;
    dataInserimento: string;
}

export interface IDeveloper {
    id: number;
    nome: string;
    email: string;
}

export interface ICollection {
    id: number;
    resourceId: number;
    resourceName: string;
    developerName: string;
}