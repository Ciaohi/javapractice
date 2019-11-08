package cn.jmjy.day13.test6;

import java.util.Scanner;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午10:55
 */
public class Button {
    private Scanner input=new Scanner(System.in);
    private boolean click=false;
    public void setOnClickListener(OnClickListener listener) {
        System.out.println("请点击（点击（true）/false）");
        if (listener != null) {
            click=input.nextBoolean();
            if (click) {
                listener.onClick();//接口回调
                click = false;
            }
        }
    }
}



