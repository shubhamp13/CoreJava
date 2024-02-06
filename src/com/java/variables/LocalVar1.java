package com.java.variables;

public class LocalVar1
{
    public static void main(String[] args)
    {
        int i=0;
        for(int j=0;j<3;j++)
        {
            i+=j;
        }
//        System.out.println(i+"    "+j);  //Can Not Found Symbol
                                        //Symbol: variable j
                                       //Location class LocalVar1

//        {
//            int j=Integer.parseInt("Ten");
//        }
//        catch (NumberFormatException e)
//        {
//            j=10;
//        }
//        System.out.println(j);    try

    }
}
