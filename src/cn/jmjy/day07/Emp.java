package cn.jmjy.day07;

public class Emp {
    // 姓名
    public String name;
    // 性别
    public char sex;
    //年龄
    public int age;
    // 工号
    public String empId;
    // 报销
    public void claimingExpenses() {
        System.out.println(name+"正在填写报销单");
        System.out.println(name+"提出了报销");
    }
}
