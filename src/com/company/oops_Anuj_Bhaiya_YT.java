package com.company;

public class oops_Anuj_Bhaiya_YT {
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Sumit";

        Person p2 = new Person();
        p2.age = 24;
        p2.name = "Jatin";

        Person p3 = new Person("Shivam",31);

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
        System.out.println(p3.age + " " + p3.name);

        p1.eat();
        p2.walks();
        p2.walks(12);

        System.out.println("Number of times the constructor is called : "+Person.count);

        Developer d1 = new Developer("SUMIT" , 23);
        d1.walks();
        d1.doWork();


    }
}

class Person {
    protected String name;
    int age;
    static int count = 0;
    public Person() {
        count++;
        System.out.println("Creating an object.");
    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walks() {
        System.out.println(name + " is walking.");
    }
    void walks(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }
    void doWork() {
        System.out.println("Person is working.");

    }
}

class Developer extends Person {
    public Developer(String name, int age) {
        super(name,age);
    }
    void walks() {
        System.out.println("Developer " + name + " is walking.");
    }
}