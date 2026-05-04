// src/components/header/index.tsx
import type { RefineThemedLayoutHeaderProps } from "@refinedev/antd";
import { useGetIdentity } from "@refinedev/core";
import {
  Layout as AntdLayout,
  Avatar,
  Space,
  Switch,
  Typography,
  Select
} from "antd";
import React, { useContext, useEffect, useState } from "react";
import { ColorModeContext } from "../../contexts/color-mode";
import { ProjectContext } from "../../contexts/ProjectContext";
import { axiosInstance } from "../../api/axiosInstance";

const { Text } = Typography;
const API_URL = import.meta.env.VITE_API_URL;

type IUser = {
  id: string | number; // Può essere email o ID
  name: string;
  avatar: string;
  role: string;
};

type Project = {
  id: number;
  nome: string;
};

type Assignment = {
  projectId: number;
};

type Developer = {
  id: number;
  email: string;
}

export const Header: React.FC<RefineThemedLayoutHeaderProps> = (props) => {
  const { data: user } = useGetIdentity<IUser>();
  const { mode, setMode } = useContext(ColorModeContext);
  const { projectId, setProjectId } = useContext(ProjectContext);
  const [projects, setProjects] = useState<Project[]>([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    const fetchProjects = async () => {
      if (!user) return;
      setLoading(true);
      try {
        const { data: allProjects } = await axiosInstance.get<Project[]>(`${API_URL}/projects`);

        if (user.role === "ADMIN") {
          setProjects(allProjects);
        } else {
          // 1. Recupera tutti i developer per trovare l'ID corrispondente a questa email
          const { data: allDevelopers } = await axiosInstance.get<Developer[]>(`${API_URL}/developers`);
          // user.id attualmente contiene l'email
          const myDeveloperRecord = allDevelopers.find(d => d.email === user.id);

          if (myDeveloperRecord) {
            // 2. Ora che abbiamo l'ID numerico, chiediamo le assegnazioni
            const { data: assignments } = await axiosInstance.get<Assignment[]>(`${API_URL}/assignments/developer/${myDeveloperRecord.id}`);
            const assignedProjectIds = assignments.map((a) => a.projectId);
            const filteredProjects = allProjects.filter((p) => assignedProjectIds.includes(p.id));
            setProjects(filteredProjects);
          } else {
            setProjects([]); // Nessun developer trovato per questa email
          }
        }
      } catch (error) {
        console.error("Errore nel recupero dei progetti:", error);
      } finally {
        setLoading(false);
      }
    };

    fetchProjects();
  }, [user]);

  useEffect(() => {
    if (projects.length > 0 && !projectId) {
      setProjectId(projects[0].id);
    }
  }, [projects, projectId, setProjectId]);

  const headerStyles: React.CSSProperties = {
    display: "flex",
    justifyContent: "space-between",
    alignItems: "center",
    padding: "0px 24px",
    height: "64px",
    position: "sticky",
    top: 0,
    zIndex: 1,
    backdropFilter: "blur(10px)",
    borderBottom: "1px solid rgba(255, 255, 255, 0.1)",
  };

  return (
      <AntdLayout.Header style={headerStyles} {...props}>
        <Space>
          <Select
              loading={loading}
              value={projectId}
              onChange={(value) => setProjectId(value)}
              placeholder="Seleziona Progetto"
              style={{ width: 250 }}
              options={projects.map((p) => ({ label: p.nome, value: p.id }))}
          />
        </Space>
        <Space>
          <Switch
              checkedChildren="🌛"
              unCheckedChildren="🔆"
              onChange={() => setMode(mode === "light" ? "dark" : "light")}
              checked={mode === "dark"}
          />
          <Space style={{ marginLeft: "8px" }} size="middle">
            {user?.name && <Text strong>{user.name}</Text>}
            {user?.avatar && <Avatar src={user?.avatar} alt={user?.name} />}
          </Space>
        </Space>
      </AntdLayout.Header>
  );
};