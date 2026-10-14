-- 豆瓣热播条目补充 rank 字段：保存豆瓣接口返回的原始序号（近期热度榜单顺序），查询按 rank 排序而非评分
ALTER TABLE douban_items ADD COLUMN rank INTEGER NOT NULL DEFAULT 0;
