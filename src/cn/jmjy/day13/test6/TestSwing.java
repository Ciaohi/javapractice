package cn.jmjy.day13.test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ciaohi
 * @date 2019/11/8 上午11:09
 */
public class TestSwing {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Java第三个GUI程序");    //创建Frame窗口
        frame.setSize(400,200);
        frame.setLayout(new BorderLayout());    //为Frame窗口设置布局为BorderLayout
        JButton button1=new JButton ("上");
        JButton button2=new JButton("左");
        JButton button3=new JButton("中");
        JButton button4=new JButton("右");
        JButton button5=new JButton("下");
        MyActionListener myActionListener=new MyActionListener();
        button3.addActionListener(myActionListener);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("上");
            }
        });
        button2.addActionListener( e->{
            System.out.println("左");
            int a=3;
            int b=5;
            System.out.println(a+b);

        });
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.CENTER);
        frame.add(button4,BorderLayout.EAST);
        frame.add(button5,BorderLayout.SOUTH);
        frame.setBounds(300,200,600,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
