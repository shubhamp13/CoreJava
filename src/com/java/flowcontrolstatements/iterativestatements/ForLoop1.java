package com.java.flowcontrolstatements.iterativestatements;

public class ForLoop1
{
    public static void main(String[] args)
    {
        /*
            1.for loop is most commonly used loop in java
            2.If we know no of iterations already then for loop is best loop

             Imp
             1.Curly braces are optional,without curly braces only one statement is
             allowed which should not be declarative statement
         */
        {
//            case 1---->Perfectly valid
            for(int i=0;i<10;i++)
                System.out.println("Hello");
        }
        {
//            case 2---->Perfectly valid
            for(int i=0;i<10;i++);
        }


        {
//            case 2---->Invalid
//                for(int i=0;i<10;i++)
//                    int a=10;
            /*
                Curly Braces are optional but without curly braces only one
                statement is allowed which should not be declarative statement
             */
        }

    }
}
