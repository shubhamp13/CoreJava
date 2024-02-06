package com.java.flowcontrolstatements.selectionstatements;

public class Case2
{
    public static void main(String[] args)
    {
        {
            /*
                else and curly braces are optional for if.and without curly braces
                only one statement is allowed and declarative statement is not allowed
             */
            if(true)
                System.out.println("Hello");
        }

        {
            /*
                "Without Curly braces only one statement is allowed that
                should not be declarative statement

                ; is also statement in java
             */
            if(true);
            ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
            //Perfectly valid
        }
        {
            /*
                curly braces are optional in if but without curly braces only one
                statement is allowed that should not be declartion statement
                otherwise we will get Compile Time Error
             */
//            if(true)
//                int x=10;

        }
        {
            /*
                Curly braces are optional,without curly braces only one
                statement is allowed that should not be declaration statement

             */
            if(true)
            {
                int x=10;
            }
        }
        {
            if(true)
            {
                System.out.println("hi");
            }
            else
                System.out.println("bye");

        }
    }
}
