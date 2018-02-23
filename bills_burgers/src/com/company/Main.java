package com.company;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", 3.56, "White", "Sausage");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.50);
        hamburger.addHamburgerAddition2("Cheese", 1.00);
        System.out.println("Total price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(3.74, "bacon");
        healthyBurger.addHealthAddition1("Lettuce", 2.35);
        healthyBurger.addHealthAddition2("Tomato", 0.50);
        System.out.println("Total healthy burger price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total deluxe burger price is: " + deluxeBurger.itemizeHamburger());
    }
}
