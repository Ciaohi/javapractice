package cn.jmjy.day13.Bind;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午2:50
 */
public class FunBindOperation {
    public static void main(String[] args) {
        ICalucator c=Math::min;//判断min方法
        int min=c.mi(1, 3);
        System.out.println(min);
    }
}

