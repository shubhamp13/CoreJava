package com.exceptionhandling.tryenhancements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithOutResources
{
    public static void main(String[] args)  throws IOException

    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new FileReader("U:\\IntelliJ\\CoreJava\\src\\com\\exceptionhandling\\tryenhancements\\shubham.txt"));
            String s=br.readLine();
            System.out.println(s);


        }
        catch ( IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            if(br!=null)
            {
                br.close();
            }

        }
    }
}
