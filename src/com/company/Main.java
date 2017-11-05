package com.company;

import com.company.entity.Animal;
import com.company.entity.Dog;
import com.company.entity.LivingBeing;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int ticks = 4;
        int delay = 500;
        Dog dog;

        Random random = new Random();

        ArrayList<ArrayList<LivingBeing>> animals = new ArrayList<>();
        animals.add(new ArrayList<>());

        int i = 0;
        while (true) {

            if(i % ticks == 0) {
                animals = Utility.increaseAge(animals);
            }

            animals.get(0).add(new Dog(random, i));

            dog = (Dog) animals.get(0).get(animals.get(0).size()-1);

            System.out.println(dog.toString() + " + Count: " + animals.get(0).size());

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ++i;
        }
    }
}
