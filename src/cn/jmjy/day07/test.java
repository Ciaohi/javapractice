package cn.jmjy.day07;

import java.util.Scanner;

/**
 * @author Ciaohi
 * @date 2019/11/1 下午1:18
 */
public class test {
    public static void main(String[] args) {
        Emp p1=new Emp();
        p1.name="xiaohei";
        p1.age=20;
        Emp p2=new Emp();
        p2.name="xiaobai";
        p2.age=88;
        System.out.println("交换前："+p1.name+":"+p1.age+";"+p2.name+":"+p2.age);
        int temp=p1.age;
        p1.age=p2.age;
        p2.age=temp;

        //swap(p1, p2);
        System.out.println("交换后："+p1.name+":"+p1.age+";"+p2.name+":"+p2.age);

    }
    public static void swap(Emp p1,Emp p2) {
        int temp=p1.age;
        p1.age=p2.age;
        p2.age=temp;
    }

    public static void basicDataType() {
        int a=5;
        int b=3;
        System.out.println("交换前：a="+a+";b="+b);
        swap(a,b);
        System.out.println("交换后：a="+a+";b="+b);
    }


    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("方法内：a="+a+";b="+b);
    }

    private static void test4() {
        StudentsBiz st = new StudentsBiz();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入学生姓名：");
            String newName = input.next();
            st.addName(newName);
        }
        st.showNames();
    }


    private static void test3() {
        Mill m=new Mill();
        String mill = m.mill("苹果");
        System.out.println("获得"+mill);
    }

    private static void test2() {
        Scanner input = new Scanner(System.in);
        Visitor v = new Visitor();
        System.out.print("请输入姓名：");
        v.name = input.next();
        System.out.print("请输入年龄：");
        v.age = input.nextInt();
        v.show();
    }






    public static void test1() {
        // 填写报销单
        Emp emp=new Emp();
        emp.empId="100001";
        emp.sex='男';
        emp.name="小黑";
        emp.claimingExpenses();
        // 财务审核
        Accounter accounter=new Accounter();
        accounter.empId="100002";
        accounter.sex='女';
        accounter.name="财务";
        accounter.auditAndReimbursement(emp.name);
        //主管审核
        Manager manager=new Manager();
        manager.empId="100003";
        manager.sex='女';
        manager.name="主管";
        manager.auditAndReimbursement(emp.name);
        // 总经理审核
        President president=new President();
        president.empId="100000";
        president.sex='男';
        president.name="总经理";
        president.auditAndReimbursement(emp.name);
        // 财务发送报销款
        accounter.sendAndReimbursement(emp.name);
    }
}
