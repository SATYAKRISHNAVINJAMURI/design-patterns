package com.satya.behavourial.strategy;

import java.util.Optional;

public interface Search<T> {
    boolean exists(T other);
    Optional<T> find(T other);
}
