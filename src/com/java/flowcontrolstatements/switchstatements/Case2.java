package com.java.flowcontrolstatements.switchstatements;

public class Case2
{
    public static void main(String[] args)
    {
        /*
            1.Every case label must be compile time constant(i.e it must be constant expression)

            2. variables are not allowed for case label.
            3.final variables are only allowed variables in switch statements

         */
        int x=10;
        int y=20;
        switch (x)
        {
            case 10:
                System.out.println("Hi");
                break;
//            case y://Constant expression required cte
        }

        int a=10;
        final int b=20;
        switch (a)
        {
            case 10:
                System.out.println("Hello");
            case b:
                System.out.println("Bye");
        }

        /*
            Both switch argument and case label can be expression but
            case label must be constant expression
         */
        int d=10;
        switch (d+10)
        {
            case 10+20+30:
                System.out.println("Hello World");
                break;
            case 20*29*28:
                System.out.println("Bye");
        }
    }
}
