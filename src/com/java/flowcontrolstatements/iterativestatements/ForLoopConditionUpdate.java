package com.java.flowcontrolstatements.iterativestatements;
public class ForLoopConditionUpdate
{
    public static void main(String[] args)
    {
        /*
            1.We can take any valid java expression and it must be of boolean type
            2.Condition part of the for loop is optional if we are not providing any condition
            then compiler will provide as true
         */

        /*
            Increment_Decrement section
            1.In the increment and decrement section of for loop we can take any java
            statement including System.out.println();
         */

        {
            //Case 1:
//            1.In the increment and decrement section of for loop we can take any java
//            statement including System.out.println();
            int i=0;
            for(System.out.println("Hello");i<3; System.out.println("hi"),i++ );

        }
    }
}
