package cn.jmjy.day11.test;

/**
 * @author Ciaohi
 * @date 2019/11/6 下午1:03
 */
public class Son extends Parent{

    public Son(){
        super();
        System.out.println("子类构造器.....");
    }
    public Son(int count){
        this.count=count;
    }

    public void say(){
        System.out.println("儿子说...");
    }
    int count=6;// 子类的成员变量
    public void show() {
        System.out.println("父类的成员变量:"+super.count);
        System.out.println("子类的成员变量:"+this.count);
    }
}
