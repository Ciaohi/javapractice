package cn.jmjy.day13.test8;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午11:01
 */
public class Client {
    public static void main(String[] args) {
       Button button=new Button();
       //匿名内部类
        //MOnClickListener
       /*button.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick() {
               System.out.println("哥们我被点点点了");
           }
       });*/
       //语法糖
       button.setOnClickListener(()-> System.out.println("为什么总是要点点..."));
    }
}
