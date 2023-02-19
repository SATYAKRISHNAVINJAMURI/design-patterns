package com.satya.behavourial.iterator;

import java.util.List;

public class PrintLinear {
    public static void main(String[] args) {
        List<Integer> values = List.of(1,2,3,4);
        var iterator = new LinearIterator(values);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
