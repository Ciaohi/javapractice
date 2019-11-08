package cn.jmjy.day13.test;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午8:34
 */
public class MVDisk implements USB {
    @Override
    public void communicateProtocals() {
        System.out.println("移动硬盘与USB接口通讯...");
    }
}
