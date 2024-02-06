package com.java.flowcontrolstatements.switchstatements;

public class Case4
{
    public static void main(String[] args)
    {
        /*
            Duplicate Case Labels inside switch are not allowed
         */
        int x=10;
        switch (x)
        {
            case 10:
            case 100:
            case 'a':
//            case 97://Duplicate Case Labels are not allowed
        }


        {

        }
    }
}
