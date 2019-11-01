package cn.jmjy.day03;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //test1();
        //test2();
       // test3();
        //test4();
        //test5();
        test6();

    }

    private static void test6() {
        int a=1;
        int b=2;
        if(a==1& b++==3){
            System.out.println("条件1,2成立");
        }
        System.out.println(b);
    }

    private static void test5() {
        int a=1;
        int b=2;
        if(a==2 && b++==3){
            System.out.println("条件1,2成立");
        }
        System.out.println(b);
    }

    private static void test4() {
        // 逻辑运算符
        // &&(短路与) ||(或) !(非) & |
        // 1&&1 = 1 ，1 && 0 =0
        // 1||1=1 1||0 = 1 0 || 0 =0
        // ！1 =0
        int a=3;
        int b=4;
        int c=5;
        if(a<b | (++a)>=b) {
            System.out.println("yes");
        }

        System.out.println("a="+a);//4,3
        System.out.println("game over");
        }



    private static void test3() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入小黑的Java成绩");
        double jScore=input.nextDouble();
        System.out.println("请输入小黑的音乐成绩");
        double mScore=input.nextDouble();
        //优先级
        if (jScore>98 && mScore>80 || jScore==100 && mScore>70){
            System.out.println("小黑可以获得一部iphone8手机");
        }
        System.out.println("程序结束");
    }

    private static void test2() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入小黑同学的成绩:");
        double bScore=input.nextDouble();
        double wScore=80;
        // > >= < <= == || (|) ! && (&)
        boolean isGreater=bScore>wScore;
        if (isGreater){
            System.out.println("小黑你真棒");
        }
        System.out.println("程序结束");
    }

    public static void test1() {
        Scanner input=new Scanner(System.in);
        System.out.println("您是否有钱???");
        String str=input.next();
        if("有".equals(str)){
            System.out.println("买两包辣条，吃一包,丢一包");
        }
        System.out.println("做梦结束...");
    }


}
