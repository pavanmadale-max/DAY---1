package com.wallet.demo;

public class StringDemo {


    public static void demonstrate() {
        String s1 = "Wallet";
        String s2 = "Wallet";
        String s3 = new String("Wallet");


        System.out.println(s1 == s2); // true (String Pool)
        System.out.println(s1 == s3); // false (Heap object)
        System.out.println(s1.equals(s3)); // true (content)
    }
}
