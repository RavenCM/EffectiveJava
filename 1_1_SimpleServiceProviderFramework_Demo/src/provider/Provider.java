package provider;

import service.Service;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 15:08
 * @version 1.0
 * @name EffectiveJava
 * @description 服务提供者框架-服务提供者（Service Provider Interface）
 */
public interface Provider {
    Service newService();
}
