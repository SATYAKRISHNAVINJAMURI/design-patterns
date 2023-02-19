package com.satya.structural.decarator;

public class Sausage extends PizzaDecorator {
    public Sausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" Sausage");
    }

    @Override
    public int getCost() {
        return super.getCost() + 6;
    }
}
