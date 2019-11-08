package cn.jmjy.day13.test;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午8:35
 */
public class UDisk implements USB {
    @Override
    public void communicateProtocals() {
        System.out.println("U盘与USB接口通讯...");
    }
}
