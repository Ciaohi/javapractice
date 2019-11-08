package cn.jmjy.day13.test2;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午9:05
 */
public class KeyBoard extends USB {
    @Override
    public void open() {
        System.out.println("键盘开启，绿灯闪呀闪呀");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，绿灯熄灭");
    }

    public void keyBoarding() {
        System.out.println("键盘打字");
    }
}
