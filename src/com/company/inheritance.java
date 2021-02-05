package com.company;

public class inheritance {
    public static void main(String[] args)
    {
        motorCycle mt = new motorCycle(5,100,25);
        System.out.println(mt.printInfo() + "\n");

        mt.seatHeight(22);
        System.out.println(mt.printInfo() + "\n");

        mt.speedUp(20);
        System.out.println(mt.printInfo() + "\n");

        mt.applyBreak(22);
        System.out.println(mt.printInfo() + "\n");
    }
}

class bicycle {
    public int gear;
    public int speed;
    bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String printInfo()
    {
        return("No. of gears are : " + gear + "\n" + "Speed of bicycle is : " + speed + "\n");
    }
}

class motorCycle extends bicycle {
    public int seatHeight;
    motorCycle(int gear, int speed, int seatHeight)
    {
        super(gear,speed);  //has to be the very first line
        this.seatHeight = seatHeight;
    }
    public void seatHeight(int newHeight)
    {
        seatHeight = newHeight;
    }
    @Override
    public String printInfo()
    {
        return(super.printInfo() + "height of seat is : " + seatHeight);
    }
}

