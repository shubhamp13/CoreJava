package com.java.flowcontrolstatements.iterativestatements;

public class FinalVariable
{
    public static void main(String[] args)
    {
        /*
            1.Every Final variable will be replaced by value at compile time only
                Example:
                    final int a=10;
                    final int b=20;
                    System.out.println(a);------------ After Compilation---->System.out.println(10);

                    System.out.println(b);-------------After Compilation---->System.out.println(20);

             Note 2:
             2.if both arguments are final variable only then compiler will only do the
             operation required

              final int a=10;
              final int b=20;
                    int c=10;
                    System.out.println(a+b);------------  After Compilation------>System.out.println(10+20);

                    System.out.println(a+c);-----------   After Compilation-------->System.out.println(10+c);

                    System.out.println(a<b);-----------   After Compilation-------->System.out.println(true);

                    System.out.println(a<c);-----------   After Compilation-------->System.out.println(10<c);
         */
    }
}
