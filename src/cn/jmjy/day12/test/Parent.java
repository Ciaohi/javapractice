package cn.jmjy.day12.test;

/**
 * @author Ciaohi
 * @date 2019/11/6 下午3:17
 */
public class Parent {
    static final int AGE=18;
    static {
        System.out.println("加载Parent类...");
    }

    public static void sayHello(){
        System.out.println("sayHello");
    }
}
