package com.company;

public class multithreading {

    public static void main(String[] args) throws InterruptedException
    {
        Test t = new Test();
        t.start();
        for(int i=0 ; i<5 ; i++) {
            System.out.println("Inside main() thread");
            Thread.sleep(1);
        }

        // --------------------------------------------
        System.out.println("------------------------");

        Thread m = new Thread(new Tests());
        m.start();
        System.out.println("Inside main thread.");
    }
}

class Test extends Thread{
    public void run()
    {
        for(int i=0 ; i<5 ; i++)
            System.out.println("Inside Test() thread");
    }
}

class Tests implements Runnable {
    public void run()
    {
        System.out.println("Inside test thread.");

    }
}