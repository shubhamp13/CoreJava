package com.java.flowcontrolstatements.switchstatements;

import java.util.Scanner;

public class Case5
{
    public static void main(String[] args) {
        /*
            If Any Case is matched then from that case all statements will be executed
            until break or end of switch found this time of scenario is known as
            fall through switch
         */
        int x = 1;
        switch (x) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Def");
        }
        /*
            In Above scenarios
            if x=0
             then output will be 0 and 1

            If x=1
            then output will be 1

            If x=2
            then output will be 2 and 3

            if x=3
            then output will be 3 and def

         */

        //*****Using of Fall Through Switch******************
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
            case 2:
            case 3:
                System.out.println("Quarter -4");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Quarter -1");
            case 7:
            case 8:
            case 9:
                System.out.println("Quarter 2");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Quarter 3");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
