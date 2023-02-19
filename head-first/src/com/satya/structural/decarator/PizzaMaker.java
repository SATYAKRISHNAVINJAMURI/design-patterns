package com.satya.structural.decarator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Mushroom(pizza);
        pizza = new Sausage(pizza);
        pizza = new Mushroom(pizza);
        pizza = new Pepper(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
