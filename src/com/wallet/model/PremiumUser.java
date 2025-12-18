package com.wallet.model;

public class PremiumUser extends User {


    public PremiumUser(String name, String email, String phone, double walletBalance) {
        super(name, email, phone, walletBalance);
    }


    @Override
    public double calculateFee(double amount) {
        return amount * 0.005; // 0.5% fee
    }
}