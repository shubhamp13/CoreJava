package com.java.flowcontrolstatements.iterativestatements;

public class DoWhileCase3
{
    public static void main(String[] args)
    {
//        {
//            /*
//                In the Below Scenario do while() loop condition is true
//                so System.out.println("Hi"); this statement will not be executed through the
//                program hence we will get compile time error saying
//                "Unreachable statement"
//             */
//            do {
//                System.out.println("Hello");
//            }while (true);
//            System.out.println("Hi");
//
//        }


//        {
//            /*
//                In this Below Scenario as do while() condition is false
//                but both statements can get executed so we will not get
//                any compile time error and output will be
//                Hello
//                Hi
//             */
//            do
//            {
//                System.out.println("hello");
//            }
//            while (false);
//            System.out.println("Hi");
//        }


//        {
//            /*
//                In this Scenario as a and b are normal variables they can be
//                changed throughout the program hence we will not get any compile time
//                error and output will be infinite time hello
//             */
//            int a=10,b=20;
//            do
//            {
//                System.out.println("Hello");
//            }
//            while (a<b);
//            System.out.println("Hii");
//        }


//        {
//            /*
//                In this Scenario as a and b are normal variables they can be
//                changed throughout the program hence we will not get any compile time
//                error and output will be
//                hello
//                hi
//
//             */
//            int a=10,b=20;
//            do
//            {
//                System.out.println("Hello");
//            }
//            while (a>b);
//            System.out.println("Hii");
//        }


//        {
//            /*
//                In this Scenario as a and b are final variables means a<b -->10<20
//                 is always true so, System.out.println("Hii"); this statement is never get executed
//                 throughout the program hence we will get compile time error saying unreacable statementt
//             */
//            final int a=10,b=20;
//            do
//            {
//                System.out.println("Hello");
//            }
//            while (a<b);
//            System.out.println("Hii");
//        }
        {
            /*
                In this Scenario as a and b are final variables means a>b -->10>20
                 is always false so,both statement can get executed so we will not
                 get any compile time error
                 output
                 Hello
                 Hii
             */
            final int a=10,b=20;
            do
            {
                System.out.println("Hello");
            }
            while (a>b);
            System.out.println("Hii");
        }
    }
}
