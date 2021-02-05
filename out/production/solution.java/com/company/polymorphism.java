package com.company;

public class polymorphism {

    public static void main(String[] args)
    {
        motorCycle obj = new motorCycle(5,100,15);

        //these will work
        bicycle obc = new motorCycle(3, 100, 25);
        bicycle obd = new bicycle(3, 100);

        obj.speedUp(20);
        obj.applyBreak(15);
        obj.seatHeight(35);

        obc.speedUp(20);
        obc.applyBreak(15);
        //obc.seatHeight(35);

        obd.speedUp(20);
        obd.applyBreak(15);
        //obd.seatHeight(35);

        System.out.println(obj.printInfo());
        System.out.println(obc.printInfo());
        System.out.println(obd.printInfo());
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