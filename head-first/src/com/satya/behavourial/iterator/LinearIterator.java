package com.satya.behavourial.iterator;

import java.util.List;

public class LinearIterator implements Iterator<Integer> {
    List<Integer> values;
    int index;
    public LinearIterator(List<Integer> values) {
        this.values = values;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index != values.size();
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        return values.get(index++);
    }
}
