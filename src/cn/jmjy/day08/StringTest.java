package cn.jmjy.day08;

import cn.jmjy.day07.Emp;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ciaohi
 * @date 2019/11/2 上午9:16
 */
public class StringTest {


    public static void main(String[] args) {
       String s1="Hello";
       s1="world";
       String s2="world";
        System.out.println(s1==s2);

    }

    public static void Stringpool() {
        String s="Hello";
        String s1="Hello";
        String s2=new String("Hello");
        String s3=new String("Hello");
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s2==s3);
    }

    public static void fileIlegal() {
        Scanner input=new Scanner(System.in);
        System.out.print("请文件名：");
        String fileName=input.next();
        // * 最后"."是否存在
        // * "."不能是第一个
        // * 判断“.”之后的字符串是不是“java”
        int index=fileName.lastIndexOf(".");
        String suffix=fileName.substring(index+1, fileName.length());
        if(index!=-1 && index!=0 && "java".equals(suffix)) {
            System.out.println("文件合法");
        }else {
            System.out.println("文件不合法");
        }
    }

    public static void emailJudge() {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入邮箱：");
        String email=input.next();
        // 两个条件：
        // * 是否包含@
        // * 是否“.”在@后面
        // 88888123@qq.com
        if(email.indexOf("@")!=-1 && email.indexOf(".")>email.indexOf("@")) {
                System.out.println("邮箱格式正确");
            }else {
                System.out.println("邮箱格式错误");
        }
    }

    public static void ignoreCase1() {
        Scanner input = new Scanner(System.in);
        String name,pwd;
        System.out.print("请输入用户名： ");
        name=input.next();
        System.out.print("请输入密码： ");
        pwd=input.next();
        if("xiaohei".equalsIgnoreCase(name) && "123456".equals(pwd) ){
            System.out.print("登录成功！ ");
        }else{
            System.out.print("用户名或密码不匹配，登录失败！");
        }
    }

    public static void equalsDemo() {
        Scanner input = new Scanner(System.in);
        String name,pwd;
        System.out.print("请输入用户名： ");
        name=input.next();
        System.out.print("请输入密码： ");
        pwd=input.next();
        if("xiaohei".equals(name) && "123456".equals(pwd) ){
            System.out.print("登录成功！ ");
        }else{
            System.out.print("用户名或密码不匹配，登录失败！");
        }
    }


    public static void codeLength() {
        Scanner input = new Scanner(System.in);
        String name;
        String pwd;
        System.out.print("请输入用户名： ");
        name = input.next();
        System.out.print("请输入密码： ");
        pwd = input.next();
        if (pwd.length() >= 6) {
            System.out.print("注册成功！ ");
        } else {
            System.out.print("密码长度不能小于6位！");
        }
    }

    public static void subString() {
        String str="www.baidu.com";
        String str1=str.substring(0,3);
        System.out.println(str1);
        String str2=str.substring(3);
        System.out.println(str2);
    }

    public static void replaceString() {
        String str="大家坏才是真的坏";
        System.out.println(str);
        str=str.replace("坏","好");
        System.out.println(str);
    }

    public static void formatString() {
        System.out.println(String.format("Hello,%s","小黑"));
        System.out.println(String.format("Hello,%s%s%s","小红","小白","小黑"));
        System.out.printf("字母c的大写是：%c %n", 'C');
        System.out.printf("布尔结果是：%b %n", "小超".equals("帅哥"));
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
    }

    public static void trasformvalues() {
        String str=" xiaohei ";
        System.out.println(str);
        System.out.println(str.trim());
        String.valueOf(1);
        String.valueOf(true);
        int i=2;
        String.valueOf(i);
        System.out.println(i+"");
    }

    public static void lowerUpper() {
        String str="aAb";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }

    public static void splitLength() {
        String[]strs={"a","b","c"};
        System.out.println(strs.length);
        String str="abc";
        System.out.println(str.length());

        String fruits="apple,banana,pear,grape,watermelon";
        //转换成字符串数组
        String[] datas = fruits.split(",");
        System.out.println(datas[0]);
    }

    public static void indexFind() {
        String str="Hello,world";
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
    }

    public static void selfDifine() {
        Emp emp1=new Emp();
        Emp emp2=new Emp();
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1==emp2);
        System.out.println(emp1.equals(emp2));
    }

    public static void equalsE() {
        String str="Hello";
        String str1=new String("Hello");
        String str2="Hello";
        System.out.println(str.equals(str1));
        System.out.println(str==str1);
        System.out.println(str.equals(str2));
        System.out.println(str==str2);
    }


    public static void containsSe() {
        String str="我爱中国";
        boolean flag1=str.startsWith("我");
        boolean flag=str.contains("爱");
        boolean flag2=str.endsWith("中国");
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
    }

    public static void ignoreCase() {
        String str3="abc";
        String str4="ABC";
        int index= str3.compareToIgnoreCase(str4);
        System.out.println(index);
    }

    public static void compareTO() {
        String str1="abc";
        String str2="def";
        int index=str1.compareTo(str2);
        System.out.println(index);
    }

    public static void copyAndEquals() {
        int [] data={1,2,5,6,7,8};
        int [] data1=new int[6];
        int [] data2=new int[6];
        data1=data;
        data2= Arrays.copyOf(data,data.length);

        System.out.println("data变化前data1的值"+Arrays.toString(data1));
        System.out.println("data变化前data2的值"+Arrays.toString(data2));
        data[0]=3;
        System.out.println("data变化后data1的值"+Arrays.toString(data1));
        System.out.println("data变化后data2的值"+Arrays.toString(data2));
    }

    public static void copyof() {
        Random r = new Random();
        int arrLength = 100000;
        int arr[] = new int[arrLength];
        int arr1[] = new int[arrLength];
        int arr2[] = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = r.nextInt(arrLength);
        }
        arr1= Arrays.copyOf(arr,arr.length);
        arr2= Arrays.copyOf(arr,arr.length);
    }

    public static void StringTest1() {
        String str="HelloWorld";
        System.out.println(str);
        str=str.concat(",基沐教育");
        System.out.println(str);
        char [] chs=str.toCharArray();
        System.out.println(chs[0]);
        char h=str.charAt(0);
        System.out.println(h);
    }


}
