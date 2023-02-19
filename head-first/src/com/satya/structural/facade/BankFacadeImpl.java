package com.satya.structural.facade;

public class BankFacadeImpl implements BankFacade {

    String accountNumber;
    int pin;

    AuthService authService;
    WelcomingService welcomingService;
    TransactionService transactionService;

    public BankFacadeImpl(String accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.authService = new AuthService() {
            @Override
            public boolean authorize(String accountNumber, int pin) {
                return true;
            }
        };
        this.welcomingService = new WelcomingService() {
            @Override
            public void welcome() {
                System.out.println("Welcome boy");
            }
        };
        this.transactionService = new TransactionService() {
            @Override
            public void deposit(int amount) {
                System.out.println("Done");
            }

            @Override
            public void withdraw(int amount) {
                System.out.println("Done");
            }
        };
    }

    @Override
    public void deposit(int amount) {
        boolean authorized = authService.authorize(accountNumber, pin);
        if(authorized) {
            welcomingService.welcome();
            transactionService.deposit(amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        boolean authorized = authService.authorize(accountNumber, pin);
        if(authorized) {
            welcomingService.welcome();
            transactionService.withdraw(amount);
        }
    }
}
