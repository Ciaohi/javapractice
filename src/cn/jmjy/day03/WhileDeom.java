package cn.jmjy.day03;

import java.util.Scanner;

public class WhileDeom {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {
        // 登录的例子：输入密码错误3次，退出程序，登录成功直接进入主界面
        Scanner input=new Scanner(System.in);
        boolean isSuccess=false;
        int counter=0;
        do {
            System.out.println("欢迎来到基沐教育系统");
            System.out.println("请输入用户名:");
            String username=input.next();
            System.out.println("请输入密码：");
            String password=input.next();
            if("jimu".equals(username) && "123".equals(password)) {
                System.out.println("登录成功");
                isSuccess=true;
            }else {
                counter++;
                if(counter>=3) {
                    System.out.println("登录失败超过3次，请求联系管理员");
                }
            }
        }while((!isSuccess) && (counter<3) );
    }

    public static void test1() {
        //需求，打印100遍基沐教育，做教育,我们是认真的
        int counter=0;
        while(counter<100){
            counter++;
            System.out.println(counter+"基沐教育，做教育，我们是认真的");
        }
    }
}
