package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Window {

    private JFrame jFrame;
    private JPanel jPanel;
    private JTextPane jContent;
    private JTextPane jReset;
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
        jContent.setText("Entity-Count: " + entityCount
                + "\n"
                + "Connections: " + connectionCount
                + "\n"
                + "\n"
                + "\n"
                + "Runtime: " + runtime + " sec"
        );
    }

    private void setDisplayOrder() {
        jPanel.add(jButton, BorderLayout.WEST);
        jPanel.add(jContent, BorderLayout.EAST);
        jPanel.add(jReset, BorderLayout.EAST);
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
        jPanel.setLayout(new BorderLayout());
        jFrame.add(jPanel);
    }

    private void addContent () {
        jContent = new JTextPane();
        jContent.setBackground(Config.backgroundColor);
        jContent.setText("Unedited");

        jReset = new JTextPane();
        jReset.setBackground(Config.backgroundColor);
        jReset.setText("Unedited2");

        jButton = new JButton("Reset");
        jButton.setLayout(null);
        jButton.setLocation(100,50);
    }

}
