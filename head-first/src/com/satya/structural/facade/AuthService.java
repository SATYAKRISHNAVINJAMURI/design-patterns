package com.satya.structural.facade;

public interface AuthService {
    boolean authorize(String accountNumber, int pin);
}
