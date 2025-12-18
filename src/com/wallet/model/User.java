package com.wallet.model;

public class User extends Person {
    private double walletBalance;


    public User(String name, String email, String phone, double walletBalance) {
        super(name, email, phone);
        this.walletBalance = walletBalance;
    }


    public double getWalletBalance() {
        return walletBalance;
    }


    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }


    public double calculateFee(double amount) {
        return amount * 0.02;
    }
}
