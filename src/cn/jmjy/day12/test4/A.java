package cn.jmjy.day12.test4;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午8:55
 */
public class A {
    D d;
    static {
        System.out.println("A1");
    } {
        System.out.println("A2");
        d=new D();
    }
    public A() {
        System.out.println("A3");
    }
}
