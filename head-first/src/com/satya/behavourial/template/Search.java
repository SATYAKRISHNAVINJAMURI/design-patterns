package com.satya.behavourial.template;

public abstract class Search {
    public void search() {
        searchInL1Cache();
        searchInL2Cache();
        searchInMemory();
        searchInDisk();
    }

    protected abstract void searchInL1Cache();

    protected abstract void searchInL2Cache();

    protected void searchInDisk() {
        System.out.println("Search in disk");
    }

    protected void searchInMemory() {
        System.out.println("Searching in memory");
    }
}
