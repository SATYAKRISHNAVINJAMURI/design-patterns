package com.satya.behavourial.strategy;

import java.util.List;
import java.util.Optional;

public class LinearSearch<T> implements Search<T> {
    private List<T> items;

    public LinearSearch(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean exists(T other) {
        return items.stream().anyMatch(item -> item.equals(other));
    }

    @Override
    public Optional<T> find(T other) {
        return items.stream().filter(item -> item.equals(other)).findFirst();
    }
}
