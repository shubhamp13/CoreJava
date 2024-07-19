package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.Scanner;
import java.util.function.Function;

public class Authentication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        Function<String,String>f1=s->s.toLowerCase();
        Function<String,String>f2=s->s.substring(0,4);

        if(f1.apply(username).equals("shubham")&&f2.apply(password).equals("puri"))
        {
            System.out.println("Logged in");
        }
        else
        {
            System.out.println("Not logged in");
        }
    }
}
