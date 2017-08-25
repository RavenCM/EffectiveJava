package stack;

import java.util.Arrays;

/**
 * @author qingsheng.chen@hand-china.com	2017.08.25 16:21
 * @version 1.0
 * @name EffectiveJava
 * @description SimpleObjectStack
 */
public class SimpleObjectStack {
    private static final int DEFAULT_SIZE = 16;
    private static final int MAX_SIZE = 1024;

    private int size = 0;
    private Object[] stack;


    public SimpleObjectStack() {
        this(DEFAULT_SIZE);
    }

    public SimpleObjectStack(int size) {
        if (size > MAX_SIZE) {
            throw new IllegalArgumentException();
        }
        stack = new Object[size];
    }

    public void push(Object e){
        ensureCapacity();
        stack[size++] = e;
    }

    public Object pop(){
        if (size == 0){
            throw new IndexOutOfBoundsException("The stack is empty!");
        }
        Object object = stack[--size];
        // Eliminate expired references
        stack[size] = null;
        return object;
    }

    private void ensureCapacity(){
        if (size == stack.length){
            if (size >= MAX_SIZE){
                throw new IndexOutOfBoundsException("The stack is full!");
            }
            size = size * 2 >= MAX_SIZE ? MAX_SIZE : size * 2;
            stack = Arrays.copyOf(stack, size);
        }
    }
}
