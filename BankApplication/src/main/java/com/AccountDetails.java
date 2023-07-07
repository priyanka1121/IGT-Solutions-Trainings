package com;
public class AccountDetails {
    private int id;
    private String accountNumber;
    private String pan;
    private double balance;

    public AccountDetails(int id, String accountNumber, String pan, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.pan = pan;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPan() {
        return pan;
    }

    public double getBalance() {
        return balance;
    }
}
