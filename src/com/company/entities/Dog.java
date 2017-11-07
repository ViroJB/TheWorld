package com.company.entities;

import java.util.Random;

public class Dog extends Animal {

    private String gender;

    public Dog(Random random, int id) {
        this.setId(id);
        this.setAge(random.nextInt(20));
        this.setMaxAge(random.nextInt(15)+20);
        this.setProbability(random.nextInt(56)+1);

        if(random.nextInt(2) == 0) {
            this.setGender("w");
        } else {
            this.setGender("m");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return ("ID: " + this.getId() +
                ", Age: " + this.getAge() +
                ", MaxAge: " + this.getMaxAge() +
                ", Gender: " + this.getGender() +
                ", Probability: " + this.getProbability()
        );
    }

    public boolean equals(Object object) {
        Random random = new Random();
        Animal animal = (Animal) object;
        if(animal == null) {
            return false;
        }
        if (this.getProbability() == animal.getProbability()
                && this.getId() != animal.getId()
                && this.getConnectedTo() == null
                && animal.getConnectedTo() == null
                && this.getAge() > 2
                && animal.getAge() > 2
                && (random.nextInt(10)+1) % 4 == 0
           )
        {
            return true;
        }
        return false;
    }

}