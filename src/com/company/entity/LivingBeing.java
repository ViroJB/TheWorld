package com.company.entity;

public class LivingBeing {

    private int id;
    private int age = 0;
    private int maxAge = 0;
    private Integer connectedTo;
    private int childs = 0;

    public LivingBeing () {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public Integer getConnectedTo() {
        return connectedTo;
    }

    public void setConnectedTo(Integer connectedTo) {
        this.connectedTo = connectedTo;
    }

    public int getChilds() {
        return childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }
}
