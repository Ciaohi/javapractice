package cn.jmjy.day11.test;

/**
 * @author Ciaohi
 * @date 2019/11/5 下午1:47
 */
public class Person {
    public static int age = 12;

    static {
        System.out.println("静态代码块1");
    }

    static {
        System.out.println("静态代码块2");
    }

    public Person() {
        System.out.println("Person 构造方法");
    }

    public static void main(String[] args) {
        Person person=new Person();
    }
}
