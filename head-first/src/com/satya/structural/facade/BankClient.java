package com.satya.structural.facade;

public class BankClient {
    public static void main(String[] args) {
        BankFacade bankService = new BankFacadeImpl("2", 2);
        bankService.deposit(100);
        bankService.withdraw(200);
    }
}
