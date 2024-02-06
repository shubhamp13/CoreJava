package com.java.flowcontrolstatements.selectionstatements;

public class Case3
{
    public static void main(String[] args)
    {
        /*
            In This Below Scenario we can see that
            in java there is no dangling else problem
            Every else part is mapped with nearest if only
            so,in first if there is another if which is false then else
            will get executed but by seeing we will assume that else part is mapped with outer if
            but else is always mapped with nearest if only

         */
        if (true)
            if (false)
            {
                System.out.println("hi");
            }
        else
            {
                System.out.println("Bye");
            }

    }
}
