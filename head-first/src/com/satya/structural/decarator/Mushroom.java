package com.satya.structural.decarator;

public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" Mushroom");
    }

    @Override
    public int getCost() {
        return super.getCost() + 7;
    }
}
