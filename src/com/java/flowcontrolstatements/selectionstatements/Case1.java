package com.java.flowcontrolstatements.selectionstatements;

public class Case1
{
    public static void main(String[] args)
    {
        /*
            The Statements which are used to control flow of execution
            of program are known as control flow statements
            There are Three Types Of Control flow statements
            1.Selection statements
            2.Iterative statements
            3.Control Transfer Statements

            1.Selection statements:
            There Are Two Types of selction statements
            1.if else
            2.switch
         */

//        {
            /*
            In This Below Scenario We Will Get Compile Time Error:
            int cannot be converted to boolean
            because x=20 will assign value to x and evaluates as 20
            so in if we cant give any other data types than boolean
             */
//            int x=10;
//            if(x=20)
//            {
//                System.out.println("Hello");
//            }
//            else
//            {
//                System.out.println("Hi");
//            }
//        }
//        {
            /*
            In Below Scenario we will get compile time error saying
            int cannot be converted to boolean
            because in if we are giving integer as an arguments
            and if only accepts boolean
             */
//            int x=0;
//            if(x)
//            {
//                System.out.println("Hello");
//            }
//            else
//            {
//                System.out.println("Hi");
//            }
//        }
        {
            /*
            In Below Scenario x==20 condition false so else part will execute
            so op=hi
             */
            int x=10;
            if(x==20)
            {
                System.out.println("Hello");

            }
            else
            {
                System.out.println("hi");
            }
        }
        {
            /*
            In Below Scenario First b=false but in if block b value is
            assigned with true so b is now true so if(true) means
            if block get executed
            so output will be "Hello"
             */
            boolean b=false;
            if(b=true)
            {
                System.out.println("Hello");
            }
            else
            {
                System.out.println("Hi");
            }
        }
        {
            /*
            In This Below Scenario b=false,and in if block b is compared with false
            b==false means false==false is true so if(true) then if block will get
            executed we will get op as "Hello"
             */
            boolean b=false;
            if(b==false)
            {
                System.out.println("Hello");
            }
            else
            {
                System.out.println("Hi");
            }
        }

    }
}
