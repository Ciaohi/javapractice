package cn.jmjy.day13.test3;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午9:17
 */
public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //开机运行
        computer.run();
        // 计算机使用鼠标
        Mouse mouse=new Mouse();
        computer.useUSB(mouse);
        // 计算机使用键盘
        USB keyBoard=new KeyBoard();
        computer.useUSB(keyBoard);
        //关机
        computer.shutDown();
    }
}
