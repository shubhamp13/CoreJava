package com.java.flowcontrolstatements.iterativestatements;

public class ForLoopUnreachable
{
    public static void main(String[] args)
    {
        {
            //Case 1:
            /*
                In This Below Scenario we will get compile time error
                saying Unreachable statement because for loop will be infinite
                so the staTement after for loop will never getting chance to execute
                hence we will get COMPILE TIME ERROR SAYING UNREACHABLE STATEMENT

             */
//            for(int i=0;true;i++)
//            {
//                System.out.println("hello");
//            }
//            System.out.println("hi");//--->CTE:-->Unreachable statement
        }

        {
            //Case 2:
            /*
                In This Below Scenario we will get compile time error
                saying Unreachable statement because Condition in for loop is always false
                so we will never get inside loop so there is no need of such type
                of loop hence we will get CTE saying unreachable statement for loop body only

             */
//            for(int i=0;false;i++)//--->CTE:-->Unreachable statement
//            {
//                System.out.println("hello");
//            }
//            System.out.println("hi");
        }
        {
            //Case 3:
            /*
                In This Below Scenario we will get compile time error
                saying Unreachable statement because for loop   does not have any condition
                then compiler will provide always true so it is infinite loop hence statement after
                loop will never get chance to execute hence we will get compile time error saying
                unreachable statement

             */
//            for(int i=0; ;i++)
//            {
//                System.out.println("hello");
//            }
//
//            System.out.println("hi");//--->CTE:-->Unreachable statement
        }

//        {
//            //Case 4:
//
//            /*
//                In Below Scenario Loop Condition is true but it can be changed in program so
//                program will compile and execute and infinite times of hello will be
//                printed on console
//             */
//            int a=10,b=20;
//            for (int i=0;a<b;i++)
//            {
//                System.out.println("Hello");
//            }
//            System.out.println("Hiii");
//
//        }

        {
            //Case 5:

            /*
                In Below Scenario Loop Condition is false but it can be changed in program so
                program will compile and execute and as condition is false hii  will be printed
             */
            int a=10,b=20;
            for (int i=0;a>b;i++)
            {
                System.out.println("Hello");
            }
            System.out.println("Hiii");

        }
//        {
//            //Case 6:
//            /*
//                In This Below Scenario we will get compile time error
//                saying Unreachable statement because here a and b are
//                 final variables so compiler will solve operations of
//                 final variables so a<b will be true so for loop will be infinite
//                so the statement after for loop will never getting chance to execute
//                hence we will get COMPILE TIME ERROR SAYING UNREACHABLE STATEMENT
//
//             */
//            final int a=10,b=20;
//            for(int i=0;a<b;i++)
//            {
//                System.out.println("hello");
//            }
//            System.out.println("hi");//--->CTE:-->Unreachable statement
//        }

        {
            //Case 7:
            /*
                In This Below Scenario we will get compile time error
                saying Unreachable statement because a and b are final variables
                 so operation will be performed by compiler only so a>b will be replaced by
                 false so Condition in for loop is always false
                so we will never get inside loop so there is no need of such type
                of loop hence we will get CTE saying unreachable statement for loop body only

             */
//            final int a=10,b=20;
//            for(int i=0;a>b;i++)//--->CTE:-->Unreachable statement
//            {
//                System.out.println("hello");
//            }
//            System.out.println("hi");
        }

    }
}
