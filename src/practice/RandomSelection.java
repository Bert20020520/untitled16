package practice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class RandomSelection extends JFrame{
    RandomSelection(String title){
        setLayout(null);
        setTitle(title);
        JButton button2 = new JButton("随机选人");
        Date nowTime = new Date();
        add(button2);
        button2.setBounds(20,10,120,40);
        JLabel label2 = new JLabel("号次会在这出现哦");
        add(label2);
        Random random = new Random();
        int a = random.nextInt(36)+1;
        label2.setBounds(160,10,220,40);
        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText("被抽到的号次是："+a);
            }
        };
        button2.addActionListener(listener2);
    }
}

