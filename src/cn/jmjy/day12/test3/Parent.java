package cn.jmjy.day12.test3;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午8:41
 */
public class Parent {
    static {
        System.out.println("1 父类静态的内容");
    } {
        System.out.println("3 父类的非静态代码块");
    }
    public Parent() {
        System.out.println("4 父类的构造方法");
    }
}
