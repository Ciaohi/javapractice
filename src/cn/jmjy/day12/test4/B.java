package cn.jmjy.day12.test4;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午8:57
 */
public class B extends A {
    static C c=new C();
    static {
        System.out.println("B1");
    } {
        System.out.println("B2");
    }
    public B() {
        System.out.println("B3");
    }
}
