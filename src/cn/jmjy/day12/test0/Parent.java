package cn.jmjy.day12.test0;

/**
 * @author Ciaohi
 * @date 2019/11/6 下午2:27
 */
public abstract class Parent {
    protected String name;
    public Parent(){
        this.name="父亲";
    }

    protected abstract void sayHello();//抽象方法，没有方法体的方法
}
