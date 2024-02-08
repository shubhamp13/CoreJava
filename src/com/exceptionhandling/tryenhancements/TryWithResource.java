package com.exceptionhandling.tryenhancements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource
{
    public static void main(String[] args)
    {

        try(BufferedReader br=new BufferedReader(new FileReader("U:/IntelliJ/CoreJava/src/com/exceptionhandling/tryenhancements/shubham.txt")))
        {
            String s=br.readLine();
            System.out.println(s);
            System.out.println("Hello World");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println();


    }

}
