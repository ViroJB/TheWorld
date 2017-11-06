package com.company;

import com.company.entity.Dog;
import com.company.entity.LivingBeing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ticks = 4; // number of ticks till age increase
        int delay = 500; // sleep delay in ms
        int startCount = 75; // amount of entities to start with
        int startTime = (int) System.currentTimeMillis()/1000;
        int currentTime;
        int connectionCount;
        Color bgColor = new Color(240, 240, 240);
        Random random = new Random();
        ArrayList<ArrayList<LivingBeing>> animals = new ArrayList<>();
        animals.add(new ArrayList<>());

        // create the window
        JFrame frame = new JFrame("TheWorld");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension d = new Dimension(Config.windowX, Config.windowY);
        frame.setSize(d);          // this and below are needed,
        frame.setPreferredSize(d); // some work here, some there

        // add panel to frame
        JPanel panel = new JPanel();
        panel.setBackground(bgColor);
        frame.add(panel);

        JTextPane jTextPane = new JTextPane();
        jTextPane.setBackground(bgColor);
        jTextPane.setText("Unedited");

        JButton button = new JButton("Get Stuff");
        button.setLayout(null);
        button.setLocation(100,50);
        button.addActionListener(new ChangeText(jTextPane, animals.get(0).size()));
        panel.add(button);


        panel.add(jTextPane);

        frame.pack();
        frame.setVisible(true);


        int id = 0;
        // let it run...
        while (true) {

            // refill if needed
            if(animals.get(0).size() <= 50) {
                for (int i = 0; i < (Config.entityStartCount/2); i++) {
                    animals.get(0).add(new Dog(random, id));
                    id++;
                }
            }

            if(id % ticks == 0) {
                animals = Utility.increaseAge(animals, random, id);
            }

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            connectionCount = Utility.connectionCount;
            currentTime = (int) System.currentTimeMillis()/1000;
            jTextPane.setText("Entity-Count: " + animals.get(0).size()
                            + "\n"
                            + "Connections: " + connectionCount
                            + "\n"
                            + "\n"
                            + "\n"
                            + "Runtime: " + (currentTime-startTime) + " sec"

            );
            ++id;
        }
    }
}
