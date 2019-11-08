package cn.jmjy.day13.test;

public interface InterfaceDemo {
    //JDK1.8之前
        //静态常量，抽象方法
    public static final int LEN=7;
    int LENGTH=8;//// 可以省略public static final，它是常量，不是变量，演示语法无意义
    //通讯协议
   // public abstract void communicateProtocals();
    void communicateProtocals();//可以省略public abstract
    //JDK1.8
        // 默认方法，静态方法
        //Lambda表达式，语法糖
    public default void test2(){

    }
    public static void test1(){

    }
    //JDK1.9
        //私有方法
        private void test3(){

        }
}
