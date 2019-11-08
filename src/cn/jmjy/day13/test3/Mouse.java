package cn.jmjy.day13.test3;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午9:02
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标开启了,红灯闪啊闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭了,红灯熄灭");

    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
