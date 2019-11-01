package cn.jmjy.day04;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
       // test1();
       // test2();
       // test3();
        test4();
    }

    private static void test4() {
        int sum=0;
        for (int i = 1; i <= 1000; i++) {
            if(i%7==0) {
                sum+=i;
            }
        }
        System.out.println("1000之内能被7整除的数之和:"+sum);
    }

    private static void test3() {
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0) {
                sum+=i;
            }
        }
        System.out.println("100以内（包括100）的偶数之和:"+sum);
    }

    private static void test2() {
            Scanner input=new Scanner(System.in);
            System.out.print("输入班级的人数: ");
            int score=0;
            int num=input.nextInt();
            int sNum=0;// 学生的大于80的人数
            for(int i=1;i<=num;i++) {
                System.out.print("请输入第"+i+"位学员的成绩：");
                score=input.nextInt();
                if(score<80) {
                    continue;
                }
                sNum++;
            }
            System.out.println("80分以上的学生人数是： " + sNum);
            double rate=(double)sNum/num *100;
            System.out.println("80分以上的学生所占的比例为："+rate+"%");
    }




    public static void test1() {
        Scanner input=new Scanner(System.in);
        int score=0;//成绩
        int sum=0;//总成绩
        int avg=0;//平均成绩
        boolean isNegative=false;// 是否是负数

        for(int i=1;i<=5;i++) {
            System.out.print("请输入5门功课中的第"+i+"门课的成绩：");
            score=input.nextInt();
            //如果某分数录入为负
            if(score<0) {
            //停止录入
                isNegative=true;
                break;
                }
        }
        sum=sum+score;
        if(!isNegative) {
            avg=sum/5;
            System.out.println("小黑结业考试的平均分："+avg);
        }else {
            System.out.println("录入错误 ");
        }
    }
}


