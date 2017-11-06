package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(200,200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
