package com.company.entities;

import java.util.ArrayList;

public class World {

    ArrayList<ArrayList<LivingBeing>> livingBeings = new ArrayList<>();


    public World () {
        livingBeings.add(new ArrayList<>());
    }

    public ArrayList<ArrayList<LivingBeing>> getLivingBeings() {
        return livingBeings;
    }

    public void setLivingBeings(ArrayList<ArrayList<LivingBeing>> livingBeings) {
        this.livingBeings = livingBeings;
    }
}
