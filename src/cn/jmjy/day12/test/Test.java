package cn.jmjy.day12.test;

/**
 * @author Ciaohi
 * @date 2019/11/6 下午3:20
 */
public class Test {
    //3 JVM标记启动类：类名与文件名相同
   /* static{
        System.out.println("Test");
    }*/
    public static void main(String[] args) throws ClassNotFoundException {
        //类加载原则:懒加载，用的时候才加载
        //Parent p=new Parent();
       // Parent p1=new Parent();
        //1 new第一次会加载类，第二次不会
        //2 继承关系:子类被加载，父类也会被加载
       //Son son=new Son();
        //3 JVM标记启动类：类名与文件名相同
        //4 调用类变量会被加载
        // System.out.println(Parent.age);
        //4 调用静态方法会加载类
         //Parent.sayHello();
        //注意事项:虽然有static,但是假如有final修饰，就变成常量，没有加载类
         //System.out.println(Parent.AGE);
        //5 反射
        Class.forName("cn.jmjy.day12.test.Parent");
       // System.out.println(Parent.age);

    }
}
