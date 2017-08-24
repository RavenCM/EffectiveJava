package service.impl;

import service.Service;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 15:24
 * @version 1.0
 * @name EffectiveJava
 * @description DefaultService
 */
public class DefaultService implements Service {
    @Override
    public void execute() {
        System.out.println("DefaultService execute...");
    }
}
