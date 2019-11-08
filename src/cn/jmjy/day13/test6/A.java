package cn.jmjy.day13.test6;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午10:34
 */
public class A {
    public void show(){
        //局部内部类
        class D{
        }
    }

    //静态内部类
    public static class C{

    }


    //成员内部类:Car-->Engine
    private String name;
    public class B{
        String name;
        public void show(){
            System.out.println(A.this.name);
        }

    }


}
