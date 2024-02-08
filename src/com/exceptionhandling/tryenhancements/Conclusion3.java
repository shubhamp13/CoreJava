package com.exceptionhandling.tryenhancements;

import java.io.BufferedReader;
import java.io.FileReader;

public class Conclusion3
{
    public static void main(String[] args)  throws Exception
    {
        try(BufferedReader br=new BufferedReader(new FileReader("shubham.txt")))
        {
//            br=new BufferedReader(new FileReader("input.txt"));
            System.out.println("We Can not reassign resource reference variable which is\n" +
                    "\t declared inside try with resource");
        }
    }
}
