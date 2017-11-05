package com.company;

import com.company.entity.LivingBeing;

import java.util.ArrayList;

public class Utility {

    public static ArrayList<ArrayList<LivingBeing>> increaseAge (ArrayList<ArrayList<LivingBeing>> animals) {

        if(animals.get(0).size() == 0) {
            return animals;
        }

        ArrayList<Integer> delList = new ArrayList<>();
        LivingBeing first;
        LivingBeing second;
        for (ArrayList<LivingBeing> animal : animals) {
            for (LivingBeing a : animal) {
                first = a;

                // mark dead Entities
                if (first.getAge() >= first.getMaxAge()) {
                    if (first.getConnectedTo() != null) {
                        second = getObjectById(animal, first.getConnectedTo());
                        second.setConnectedTo(null);
                    }
                    delList.add(a.getId());

                // increase age for all others
                } else {
                    first.setAge(first.getAge() + 1);
                }
            }

            // delete dead Entities
            for (int i = 0; i < delList.size(); i++) {
                animal = deleteObjectById(animal, delList.get(i));
                System.out.println("Deleted ID: " + delList.get(i));
            }


            for (int i = 0; i < animal.size(); i++) {
                for (int j = 0; j < animal.size(); j++) {

                    if(animal.get(i).equals(animal.get(j))) {
                        animal.get(i).setConnectedTo(animal.get(j).getId());
                        animal.get(j).setConnectedTo(animal.get(i).getId());
                        System.out.println("verbindung " + animal.get(i).getId() + "-" + animal.get(j).getId());
                    }
                }
            }
        }

        return animals;
    }

    public static LivingBeing getObjectById(ArrayList<LivingBeing> objects, int id) {
        LivingBeing lb = new LivingBeing();
        for (LivingBeing object: objects) {
            if(object.getId() == id) {
                return object;
            }
        }
        return lb;
    }

    public static ArrayList<LivingBeing> deleteObjectById(ArrayList<LivingBeing> livingBeings, int id) {
        for (int i = 0; i < livingBeings.size(); i++) {
            if(livingBeings.get(i).getId() == id) {
                livingBeings.remove(i);
                return livingBeings;
            }
        }
        return livingBeings;
    }
}
