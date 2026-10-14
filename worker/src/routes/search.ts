import { Hono } from 'hono';
import type { Env } from '../types';
import {
  handleSearchRest,
  handleSearchStream,
  handleResourceCheck,
  handleResourceReport,
  handleValidityBatch,
} from '../services/search';

/** 搜索路由：GET /api/search/stream（SSE 主路径）、GET /api/search（REST 兜底） */
const searchRoutes = new Hono<{ Bindings: Env }>();

searchRoutes.get('/stream', handleSearchStream);
searchRoutes.get('/', handleSearchRest);

export default searchRoutes;

/** 资源路由：GET /api/resource/check（即时检测）、POST /api/resource/check-batch（批量检测）、POST /api/resource/report（报失效） */
export const resourceRoutes = new Hono<{ Bindings: Env }>();

resourceRoutes.get('/check', handleResourceCheck);
resourceRoutes.post('/check-batch', handleValidityBatch);
resourceRoutes.post('/report', handleResourceReport);
