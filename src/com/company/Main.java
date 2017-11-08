package com.company;

import com.company.entities.Dog;
import com.company.entities.LivingBeing;
import com.company.entities.World;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int startTime = (int) System.currentTimeMillis()/1000;
        int currentTime;
        int connectionCount;
        int id = 0;

        Random random = new Random();


        // create the window
        Window window = new Window();

        // ... and the world
        World world = new World();

        // let it run...
        while (true) {

            // refill if needed
            if(world.getLivingBeings().get(Config.DOGS).size() <= 50) {
                for (int i = 0; i < (Config.entityStartCount/2); i++) {
                    world.getLivingBeings().get(Config.DOGS).add(new Dog(random, id));
                    id++;
                }
            }

            if(id % Config.agingInterval == 0) {
                world.setLivingBeings(Utility.increaseAge(world.getLivingBeings(), random, id));
            }


            // update the pane text
            connectionCount = Utility.connectionCount;
            currentTime = (int) System.currentTimeMillis()/1000;
            window.setPaneText(world.getLivingBeings().get(Config.DOGS).size(), connectionCount, (currentTime-startTime));

            try {
                Thread.sleep(Config.sleepDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ++id;
        }
    }
}
