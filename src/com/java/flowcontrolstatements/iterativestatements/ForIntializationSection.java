package com.java.flowcontrolstatements.iterativestatements;

public class ForIntializationSection
{
    public static void main(String[] args)
    {
        /*
            1.The Initialization Part of the for loop will be get executed only once
            through the life cycle of loop

            2.Here we can declare and initialize local variables for
            for loop

            3.Here we can declare any no of variables but they must be of same type
            if we try to declare variables of different types then we will get
            compile time error

            *******for loop initialization statements***
            1.int i=0,j=0;----->valid
            2.int i=0,String s="shubham"------>Invalid
            3.int i=0,int j=0;---->Invalid
            **********************************************


            4.In The initialization section of for loop we can use any valid statement
            including System.out.println()


         */
        {
//            4.In The initialization section of for loop we can use any valid statement
//            including System.out.println()
            int i=0;
            for(System.out.println("Start");i<3;i++)
            {
                System.out.println(i);
            }
        }
    }
}
