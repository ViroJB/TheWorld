package com.company;

import com.company.entities.LivingBeing;

import java.util.ArrayList;

public class EntityController {

    private ArrayList<Integer> deadEntities = new ArrayList<>();

    public void addDeadEntity(int id) {
        deadEntities.add(id);
    }

    public void deleteDeadEntites (ArrayList<LivingBeing> livingBeings) {
        for (int i = 0; i < deadEntities.size(); i++) {
            livingBeings = deleteObjectById(livingBeings, deadEntities.get(i));
            System.out.println("Deleted ID: " + livingBeings.get(i));
        }
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
