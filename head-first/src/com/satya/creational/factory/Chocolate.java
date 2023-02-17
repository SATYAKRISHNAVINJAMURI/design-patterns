package com.satya.creational.factory;

public abstract class Chocolate {

    int weight;
    protected ChocolateType type;
    protected int cost;

    public Chocolate(int weight) {
        this.weight = weight;
        this.cost = 20;
    }

    public String getType() {
        return type.toString();
    }

    public int getCost() {
        return this.cost * weight;
    }
}
