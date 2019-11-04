package cn.jmjy.day09;

import java.util.Scanner;

/**
 * @author Ciaohi
 * @date 2019/11/3 下午4:53
 */
public class Stringbuffer1 {
    public static void main(String[] args) {
        Integer i1=128;//超过了byte的最大范围
        Integer i2=128;
        System.out.println(i1==i2);
        Integer i3=new Integer(128);
        Integer i4=new Integer(1288);
        System.out.println(i3==i4);

    }


    public static void StringBufferDemo2() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一串数字： ");
        String nums = input.next();
        StringBuffer str=new StringBuffer(nums);
        for(int i=str.length()-3;i>0;i=i-3){
            str.insert(i,',');
        }
        System.out.print(str);
    }


    public static void StringBufferDemo() {
        long start=System.currentTimeMillis();
        String str="xiaohei";
        for(int i=0;i<100000;i++){
            str=str+i;
        }
        long end=System.currentTimeMillis();
        System.out.println("String类拼接十万个字符所花的时间"+(end-start));


        start=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer();
        sb.append("xiaohei");
        for(int i=0;i<100000;i++){
            sb.append(i);
        }
        end=System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("StringBuffer类拼接十万个字符所花的时间"+(end-start));


        start=System.currentTimeMillis();
        StringBuilder sbd=new StringBuilder();
        sbd.append("xiaohei");
        for(int i=0;i<100000;i++){
            sbd.append(i);
        }
        end=System.currentTimeMillis();
        System.out.println(sbd);
        System.out.println("StringBuilder类拼接十万个字符所花的时间"+(end-start));
    }

}
