import provider.Provider;
import provider.impl.DefaultProvider;
import service.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 15:13
 * @version 1.0
 * @name EffectiveJava
 * @description 服务提供者框架-提供者注册API（Provider Registration API） & 服务访问API（Service Access API）
 */
public class Services {
    private Services() {
    }

    // Maps service names to services
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    static {
        // Register DefaultProvider
        registerDefaultProvider(new DefaultProvider());
    }

    // Provider registration API
    public static void registerDefaultProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    // Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider provider = providers.get(name);
        if (provider == null){
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }
        return provider.newService();
    }
}
