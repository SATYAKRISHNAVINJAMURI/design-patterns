package com.satya.creational.factory;

public interface ChocolateFactory {

    public static Chocolate getChocolate(ChocolateType type) {
        switch (type) {
            case HOT:
                return new HotChocolate(10);
            case COLD:
                return new ColdChocolate(10);
            case MILK:
                return new MilkChocolate(10);
            default:
                throw new NotPresentException();
        }
    }

    abstract Chocolate getChocolate(int weight);

    public static void main(String[] args) {
        System.out.println(ChocolateFactory.getChocolate(ChocolateType.HOT).getType());
        System.out.println(ChocolateFactory.getChocolate(ChocolateType.COLD).getType());
        System.out.println(ChocolateFactory.getChocolate(ChocolateType.MILK).getCost());
        System.out.println(new ColdChocolate(10).getCost());
    }
}
