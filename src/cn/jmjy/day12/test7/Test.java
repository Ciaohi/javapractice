package cn.jmjy.day12.test7;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午11:09
 */
public class Test {
    public static void main(String[] args) {
        Pet dog=new Dog();
        Dog d=(Dog)dog;
        d.wan();
        Pet cat=new Cat();
        Cat c=(Cat) cat;
        c.miao();


    }
}
