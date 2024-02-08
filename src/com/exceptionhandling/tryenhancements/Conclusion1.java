package com.exceptionhandling.tryenhancements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Conclusion1
{
    public static void main(String[] args)throws  Exception
    {
        try(FileWriter fw=new FileWriter("F://input.txt");
            BufferedReader br=new BufferedReader(new FileReader("F://input.txt")))
        {
            fw.write("Shubham Pandit Puri");
            fw.close();
            String s=br.readLine();
            System.out.println(s);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
