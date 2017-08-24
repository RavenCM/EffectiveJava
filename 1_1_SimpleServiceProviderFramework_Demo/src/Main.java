import service.Service;

/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 15:27
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {

    public static void main(String[] args){
        Service service = Services.newInstance();
        service.execute();
    }
}
