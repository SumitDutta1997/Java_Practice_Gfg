package com.company;

public class encapsulation {

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setCgpa(7.5f);
        s1.name = "Sumit Dutta";
        System.out.println(s1.getCgpa());
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    private float cgpa;
    static int numberOfStudents;

    public float getCgpa() {  //getter
        return cgpa;
    }

    public void setCgpa(float cgpa) {   //setter
        this.cgpa = cgpa;
    }

    public static int getNumberOfStudents() {   //getter
        return numberOfStudents;
    }
}