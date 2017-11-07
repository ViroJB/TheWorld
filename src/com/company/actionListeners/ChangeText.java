package com.company.actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeText implements ActionListener {

    private int count;
    private JTextPane jTextPane;

    public ChangeText (JTextPane jTextPane, int count) {
        this.count = count;
        this.jTextPane = jTextPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jTextPane.setText("Entity-Count: " + count + " - " + System.currentTimeMillis());
    }
}
