package cn.jmjy.day12.test3;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午8:44
 */
public class Son extends Parent{
    static {
        System.out.println("2 子类的静态的内容");
    } {
        System.out.println("5 子类的非静态代码块");
    }
    public Son() {
        System.out.println("6 子类的构造方法");
    }
}
