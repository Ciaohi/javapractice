package cn.jmjy.day12.test2;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午8:30
 */
public class Test {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        String s3=new String("abc");
        String s4=new String("abc").intern();//常量池字符
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s4);
    }
}
