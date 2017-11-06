package com.company;

import javax.swing.*;
import java.awt.*;

public class Window {

    private JFrame jFrame;
    private JPanel jPanel;
    private JTextPane jTextPane;
    private JButton jButton;

    private Dimension d = new Dimension(Config.windowX, Config.windowY);

    public Window () {

        openWindow();
        createPanel();
        addContent();
        setDisplayOrder();

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public void setPaneText(int entityCount, int connectionCount, int runtime) {
        jTextPane.setText("Entity-Count: " + entityCount
                + "\n"
                + "Connections: " + connectionCount
                + "\n"
                + "\n"
                + "\n"
                + "Runtime: " + runtime + " sec"
        );
    }

    private void setDisplayOrder() {
        jPanel.add(jButton);
        jPanel.add(jTextPane);
    }

    private void openWindow () {
        jFrame = new JFrame(Config.windowTitle);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(d);          // this and below are needed,
        jFrame.setPreferredSize(d); // some work here, some there
    }

    private void createPanel () {
        jPanel = new JPanel();
        jPanel.setBackground(Config.backgroundColor);
        jFrame.add(jPanel);
    }

    private void addContent () {
        jTextPane = new JTextPane();
        jTextPane.setBackground(Config.backgroundColor);
        jTextPane.setText("Unedited");

        jButton = new JButton("Get Stuff");
        jButton.setLayout(null);
        jButton.setLocation(100,50);
    }

}
