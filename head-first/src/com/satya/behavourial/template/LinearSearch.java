package com.satya.behavourial.template;

public class LinearSearch extends Search {
    @Override
    protected void searchInL1Cache() {
        System.out.println("Linear search in L1 cache");
    }

    @Override
    protected void searchInL2Cache() {
        System.out.println("Linear search in L2 cache");
    }

    @Override
    protected void searchInMemory() {
        System.out.println("Linear search in memory");
    }
}
