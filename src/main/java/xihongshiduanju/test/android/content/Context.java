package android.content;

import java.util.HashMap;
import java.util.Map;

/** 桌面测试桩：内存 SharedPreferences，进程内持久（设备一次注册本轮复用）。 */
public class Context {

    private static final Map<String, Map<String, String>> STORES = new HashMap<>();

    public java.io.File getExternalFilesDir(String type) {
        return new java.io.File(java.io.IOException.class.getResource("/").getPath());
    }

    public SharedPreferences getSharedPreferences(String name, int mode) {
        return STORES.computeIfAbsent(name, k -> new HashMap<>()) != null
                ? new MemPrefs(STORES.get(name)) : null;
    }

    public interface SharedPreferences {
        String getString(String key, String defValue);

        Editor edit();

        interface Editor {
            Editor putString(String key, String value);

            void apply();
        }
    }

    static class MemPrefs implements SharedPreferences {
        private final Map<String, String> store;

        MemPrefs(Map<String, String> store) {
            this.store = store;
        }

        public String getString(String key, String defValue) {
            return store.getOrDefault(key, defValue);
        }

        public Editor edit() {
            return new Editor() {
                public Editor putString(String key, String value) {
                    store.put(key, value);
                    return this;
                }

                public void apply() {
                }
            };
        }
    }
}
