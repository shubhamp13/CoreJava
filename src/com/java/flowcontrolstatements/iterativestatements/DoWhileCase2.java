package com.java.flowcontrolstatements.iterativestatements;

public class DoWhileCase2
{
    public static void main(String[] args)
    {
        do
            while(true)
                System.out.println("Hi");
            while (false);

            /*
                In This Above Scnario we are getting that there are more than two statements
                without curly braces but in reality there are only one which is while.
                whole while loop is considered as one statement for do block
             */
    }
}
