import { RefineThemes } from "@refinedev/antd";
import { ConfigProvider, theme } from "antd";
import {
  type PropsWithChildren,
  createContext,
  useEffect,
  useState,
} from "react";

type ColorModeContextType = {
  mode: string;
  setMode: (mode: string) => void;
};

export const ColorModeContext = createContext<ColorModeContextType>(
    {} as ColorModeContextType
);

export const ColorModeContextProvider: React.FC<PropsWithChildren> = ({
                                                                        children,
                                                                      }) => {
  const colorModeFromLocalStorage = localStorage.getItem("colorMode");
  const isSystemPreferenceDark = window?.matchMedia(
      "(prefers-color-scheme: dark)"
  ).matches;

  const systemPreference = isSystemPreferenceDark ? "dark" : "light";
  const [mode, setMode] = useState(
      colorModeFromLocalStorage || systemPreference
  );

  useEffect(() => {
    window.localStorage.setItem("colorMode", mode);
  }, [mode]);

  const { darkAlgorithm, defaultAlgorithm } = theme;

  return (
      <ColorModeContext.Provider
          value={{
            setMode,
            mode,
          }}
      >
        <ConfigProvider
            theme={{
              ...RefineThemes.Blue,
              algorithm: mode === "light" ? defaultAlgorithm : darkAlgorithm,
              token: {
                colorPrimary: "#A2C7E5",
                colorBgBase: mode === "light" ? "#F0F2F5" : "#141414",
                borderRadius: 24,
                fontFamily: "system-ui, -apple-system, sans-serif",
              },
              components: {
                Layout: {
                  bodyBg: mode === "light" ? "#F0F2F5" : "#141414",
                  headerBg: mode === "light" ? "rgba(255, 255, 255, 0.6)" : "rgba(20, 20, 20, 0.8)",
                },
                Menu: {
                  itemBg: "transparent",
                  itemSelectedBg: "#A2C7E520",
                  itemSelectedColor: "#A2C7E5",
                },
                Card: {
                  colorBgContainer: mode === "light" ? "rgba(255, 255, 255, 0.6)" : "rgba(30, 30, 30, 0.6)",
                }
              }
            }}
        >
          {children}
        </ConfigProvider>
      </ColorModeContext.Provider>
  );
};