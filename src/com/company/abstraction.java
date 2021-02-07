package com.company;

public class abstraction {

    public static void main(String[] args)
    {
        Audi a1 = new Audi();
        a1.start();
        BMW b1 = new BMW();
        b1.start();
    }
}

abstract class Car {
    int price;
    abstract void start();
}

class Audi extends Car {
    @Override
    void start() {
        System.out.println("Audi is starting.");
    }
}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW is starting.");
    }
}
