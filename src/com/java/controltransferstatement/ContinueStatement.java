package com.java.controltransferstatement;

public class ContinueStatement
{
    public static void main(String[] args)
    {
        /*
            ******continue*******
            1.We can use continue statement only inside loop
            2.It is used to skip iteration of loop  for some condition
            3.If we try to use continue outside loop we will get compile time error
            * saying continue outside loops
         */
        for (int i=0;i<10;i++)
        {
            if(i%2==0)
                continue;
            System.out.println(i);
        }
    }
}
