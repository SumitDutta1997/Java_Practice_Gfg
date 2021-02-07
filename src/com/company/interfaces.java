package com.company;

public class interfaces implements car, Persons {
    public static void main(String[] args) {
        interfaces t1 = new interfaces();
        t1.walk();
        t1.start();
    }

    @Override
    public void start() {
        System.out.println("My car is starting.");
    }
    @Override
    public void walk() {
        System.out.println("Person is walking.");
    }
}

interface car {
    void start();
}
interface Persons {
    void walk();
}