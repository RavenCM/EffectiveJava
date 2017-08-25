import stack.SimpleObjectStack;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.25 16:21
 * @version 1.0
 * @name EffectiveJava
 * @description Main
 */
public class Main {

    public static void main(String[] args) {
        SimpleObjectStack simpleObjectStack = new SimpleObjectStack();
        for (int i = 0; i < 10 ; i++){
            simpleObjectStack.push("Hello World" + i);
        }
        for (int i = 0; i < 10 ; i++){
            System.out.println(simpleObjectStack.pop());
        }
    }
}
