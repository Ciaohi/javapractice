package cn.jmjy.day12.test7;

/**
 * @author Ciaohi
 * @date 2019/11/7 下午2:10
 */
public class Test1 {
    public static void main(String[] args) {
        Pet dog=new Dog();
        Pet cat=new Cat();
        Master master=new Master();
        master.palyWith(dog);
        master.palyWith(cat);
    }
}
