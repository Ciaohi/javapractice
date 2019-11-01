package cn.jmjy.day03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        //test1();
        // test2();
        //test3();
        //test4();
        //test5();
        //test6();
        test7();
    }

    private static void test7() {
        Integer[] scores = {90,80,98,100,70};
        //没有排序前
        for (int score:scores) {
            System.out.print(score+" ");
        }
        System.out.println();
        //排序
        Arrays.sort(scores, Collections.reverseOrder());
        //排序后
        for (int score:scores) {
            System.out.print(score+" ");
        }
    }

    private static void test6() {
        String names[]= {"iPhone","荣耀","小米","华为","vivo","OPPO"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(" "+names[i]);
        }
        System.out.println();
        for(String name:names) {
            System.out.print(" "+name);
        }
    }

    private static void test5() {
        for(int i=1;i<10;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
                break;
            }
            System.out.println();
            break;
        }
    }

    private static void test4() {
        for(int i=1;i<10;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    private static void test3() {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个值：");
        int val=input.nextInt();
        System.out.println("根据这个值可以输出以下加法表: ");
        for( int i = 0, j = val; i<=val; i++,j--){
            System.out.println(i + " + " + j + " = " + (i+j));
        }
    }

    private static void test2() {
        Scanner input=new Scanner(System.in);
        int score=0;
        int sum = 0;
        int avg=0;
        String name="小黑";
        for(int i = 0; i < 5; i++){ //循环5次录入5门课成绩
            System.out.print("请输入5门功课中第" + (i+1) + "门课的成绩： ");
            score = input.nextInt(); //录入成绩
            sum = sum + score; //计算成绩和
        }
        avg = sum / 5; //计算平均分
        System.out.println(name + "的平均分是：" + avg);
    }




    public static void test1() {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
            System.out.println("i="+i);
        }
        System.out.println("sum="+sum);
    }
}
