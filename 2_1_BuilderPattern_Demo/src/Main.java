/**
 * @author qingsheng.chen@hand-china.com	2017.06.26 19:39
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {

    public static void main(String[] args){
        Entity entity = new Entity.Builder().a(1).b(2L).c(3D).d("d").build();
        System.out.println(entity.toString());
    }
}
