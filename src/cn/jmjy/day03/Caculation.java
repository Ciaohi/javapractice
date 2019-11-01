package cn.jmjy.day03;

import java.util.Random;
import java.util.Scanner;

public class Caculation {
    public static void main(String[] args) {
        //test1();
        test2();
       // test3();
        //test4();
    }

    private static void test4() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入操作符：（+，‐，*，/， 其中一个）");
        String oper=input.next();
        System.out.println("请输入第一位数：");
        double firstNum=input.nextDouble();
        System.out.println("请输入第二位数：");
        double secondNum=input.nextDouble();
        switch (oper) {
            case "+":
                System.out.println(firstNum+"+"+secondNum+"="+(firstNum+secondNum));
                break;
            case "‐":
                System.out.println(firstNum+"‐"+secondNum+"="+(firstNum-secondNum));
                break;
            case "*":
                System.out.println(firstNum+"*"+secondNum+"="+(firstNum*secondNum));
                break;
            case "/":
                System.out.println(firstNum+"/"+secondNum+"="+(firstNum/secondNum));
                break;
            default:
                break;
        }
    }

    private static void test3() {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入是否是会员：(是（y）)");
        String isMemeber=input.next();
        System.out.println("请输入购买金额：");
        double money=input.nextDouble();
        if("y".equals(isMemeber)) {
       // 会员
            if(money>=100 && money<200) {
                money=money*0.8;
            }else if(money>=200) {
                money=money*0.75;
            }
        }else {
       // 不是会员
            if(money>=100) {
                money=money*0.9;
            }
        } System.out.println("实际支付的价格："+money);
    }

    private static void test2() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入茶友号(5位数)：");
            int cardNo = input.nextInt();
            if (cardNo > 9999) {
                int bWei = cardNo / 100 % 10;
                System.out.println("bWei=" + bWei);
                //随机数字
                Random r = new Random();
                int rand = r.nextInt(10);
                System.out.println("rand=" + rand);
                if (bWei == rand) {
                    System.out.println("恭喜您成为幸运会员");
                    break;
                }
            } else {
                System.err.println("请输入5位数的茶友号");
            }
        }
    }

    public static void test1() {
        int a=10;
        int b=20;
        int max=a>b?a:b;
        System.out.println("最大值 "+max);
    }
}
