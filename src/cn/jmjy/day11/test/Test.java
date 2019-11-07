package cn.jmjy.day11.test;

import java.util.Arrays;

/**
 * @author Ciaohi
 * @date 2019/11/5 下午12:52
 */
public class Test {
    public static void main(String[] args) {
        Son son=new Son(12);
    }

    public static void ArraysUtilDemo() {
        // 二分查找
        int[] arr= {1,4,8,99,158};
        int index = Arrays.binarySearch(arr, 99);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }

    public static void MathMethodDemo() {
        System.out.println(Math.pow(3, 2));//3的2次方
        System.out.println(Math.sqrt(4));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(3, 2));
        System.out.println((int)(Math.random()*10));
        // 天
        System.out.println(Math.ceil(3.1));
        // 地
        System.out.println(Math.floor(3.8));
        // 四舍五入
        System.out.println(Math.round(3.5));
    }

    public static void dogO() {
        Dog dog=new Dog();//种类
        //dog.id=10001;
        dog.setId(101);
        dog.setAge(3);
        dog.setLove(10);
        dog.setHealth(100);//属性
        dog.fight("小猫");//方法
        //类的编写者与使用者
    }
}
