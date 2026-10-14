import { defineConfig } from "vite";
import uni from "@dcloudio/vite-plugin-uni";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [uni()],
  server: {
    port: 5173,
    proxy: {
      // 开发时代理到本地 Worker；生产同域部署在 Worker 下走相对路径
      "/api": {
        target: "http://localhost:8787",
        changeOrigin: true,
      },
    },
  },
});
