package cn.jmjy.day11.test;

/**
 * @author Ciaohi
 * @date 2019/11/6 下午1:03
 */
public class Parent {


    public Parent(){
        System.out.println("父类构造器......");
    }
    public Parent(int count){
        this.count=count;
        System.out.println("父亲");
    }


    public void say(){
        System.out.println("父亲说话...");
    }

    int count=8;// 父类的成员变量


}
