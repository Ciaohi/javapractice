package cn.jmjy.day13.test6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午11:21
 */
public class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("你为什么要点我");
    }
}
