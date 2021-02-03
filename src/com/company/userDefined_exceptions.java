package com.company;

import java.util.Scanner;

public class userDefined_exceptions {

    public static void main(String[] args)
    {
        int balance;
        Scanner sc = new Scanner(System.in);
        try {
            balance = sc.nextInt();
            updateBalance(balance);
        }
        catch(InvalidBalanceException ex) {
            System.out.println("Caught in catch of InvalidBalanceException");
        }
        catch(NumberFormatException ex) {
            System.out.println("Caught in catch of NumberFormatException");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }
        catch(Exception ex) {
            System.out.println("Caught in catch of Parent Exception");
        }
        System.out.println("Main() method executed successfully");
    }

    public static void updateBalance(int balance) throws InvalidBalanceException
    {
        if(balance<0)
        {
            throw(new InvalidBalanceException("Account balance cannot be less than zero"));
        }
        System.out.println("No Exception occurred in updateBalance() method");
    }
}

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message)
    {
        super(message);
    }
}
