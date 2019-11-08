package cn.jmjy.day13.Bind;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午3:00
 */
public class FunBindOperation2 {
    public void display() {
        System.out.println("good display");
    }
    public static void main(String[] args) {
        FunBindOperation2 o2=new FunBindOperation2();
        IGood gd=o2::display;
        gd.display();
    }
}
