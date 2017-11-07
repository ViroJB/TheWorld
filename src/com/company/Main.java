package com.company;

import com.company.entities.Dog;
import com.company.entities.LivingBeing;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int startTime = (int) System.currentTimeMillis()/1000;
        int currentTime;
        int connectionCount;
        int id = 0;

        Random random = new Random();
        ArrayList<ArrayList<LivingBeing>> animals = new ArrayList<>();
        animals.add(new ArrayList<>());

        // create the window
        Window window = new Window();

        // let it run...
        while (true) {

            // refill if needed
            if(animals.get(0).size() <= 50) {
                for (int i = 0; i < (Config.entityStartCount/2); i++) {
                    animals.get(0).add(new Dog(random, id));
                    id++;
                }
            }

            if(id % Config.agingInterval == 0) {
                animals = Utility.increaseAge(animals, random, id);
            }


            // update the pane text
            connectionCount = Utility.connectionCount;
            currentTime = (int) System.currentTimeMillis()/1000;
            window.setPaneText(animals.get(0).size(), connectionCount, (currentTime-startTime));

            try {
                Thread.sleep(Config.sleepDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ++id;
        }
    }
}
