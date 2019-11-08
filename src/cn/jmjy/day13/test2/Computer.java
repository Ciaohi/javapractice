package cn.jmjy.day13.test2;

import cn.jmjy.day13.test3.KeyBoard;
import cn.jmjy.day13.test3.Mouse;
import cn.jmjy.day13.test3.USB;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午9:07
 */
public class Computer {
    // 计算机开启运行功能
    public void run() {
        System.out.println("计算机运行");
    }
    // 使用USB设备功能
    public void useUSB(USB usb) {
        if(usb!=null) {
            usb.open();
            if(usb instanceof Mouse) {
                ((Mouse)usb).click();
            }else if(usb instanceof KeyBoard) {
                ((KeyBoard)usb).keyBoarding();
            }
            usb.close();
        }
    }
    //计算机关闭
    public void shutDown() {
        System.out.println("计算机关闭");
    }
}
