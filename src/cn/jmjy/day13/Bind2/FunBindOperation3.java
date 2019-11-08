package cn.jmjy.day13.Bind2;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午3:12
 */
public class FunBindOperation3 {
    public static void main(String[] args) {
        IGood good=Good::new;
        Good g=good.createGood("java in thinking", 20);
        System.out.println(g.name+":"+g.price);
    }
}
