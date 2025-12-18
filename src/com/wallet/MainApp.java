package com.wallet;

import com.wallet.model.*;
import com.wallet.util.Calculator;
import com.wallet.demo.*;


public class MainApp {


    public static void main(String[] args) {


        User user = new User("Pavan", "p@mail.com", "999", 1000);
        PremiumUser premium = new PremiumUser("VIP", "vip@mail.com", "888", 5000);


        System.out.println("User Fee: " + user.calculateFee(1000));
        System.out.println("Premium Fee: " + premium.calculateFee(1000));


        System.out.println(Calculator.add(5, 10));
        System.out.println(Calculator.add(2.5, 3.5));


        int x = 10;
        MemoryDemo.changePrimitive(x);
        System.out.println("Primitive after call: " + x);


        StringBuilder sb = new StringBuilder("Hello");
        MemoryDemo.changeReference(sb);
        System.out.println("Reference after call: " + sb);


        WrapperDemo.demonstrate();
        StringDemo.demonstrate();
    }
}
