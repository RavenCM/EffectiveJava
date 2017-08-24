package provider.impl;

import provider.Provider;
import service.Service;
import service.impl.DefaultService;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 15:25
 * @version 1.0
 * @name EffectiveJava
 * @description DefaultProvider
 */
public class DefaultProvider implements Provider{

    @Override
    public Service newService() {
        return new DefaultService();
    }
}
