package com.java.flowcontrolstatements.switchstatements;

public class Case6
{
    public static void main(String[] args)
    {
        int x=3;
        switch (x)
        {
            default:
                System.out.println("default");
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);

        }
        /*
            In Above Scenario
            if x=0
            output:->0

            if x=1
            output:->1
                     2
            if x=2
            output:->2

            if x=3
            output:->default
                        0

         */
    }
}
