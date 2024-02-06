package com.java.Operators.incrementDecrement;

public class FinalIncrementDecrement
{
    public static void main(String[] args)
    {
        /*
            1.There Are two types of increment and decrement operators
                a.Pre-increment
                b.Post-Increment
             2. In Pre Increment Operators Value is modified first then assigned
             3.In Post Increment Operator value is assigned then modified

             4.We can not use increment and decrement operators on values
                Example int a=10;
                            ++10;//Invalid
             5.We can not use increment and decrement operator nested
             int b=10;
             int c=++(++b);//Here (++b)-->11-->++(11)-->Invalid

             6.increment and decrement operator can be applied on all primitive data types except boolean

             7.Every Arithmatic operator result type is
                max(int ,typeof a,type of b)
               Example 1:
                byte a=10;
                byte b=20;
                byte c=a+b;

                max(int,byte,byte)----->int
                so we will get compile time error saying possible lossy conversion from byte to int

              Example 2:
              byte b=10;
              b=b+1;
              max(int,byte,int)--->int
              so we will get compile time error saying possible lossy conversion from byte to int

              Example 3:
              byet b=10;
              ++b;
              internally increment works
              b=(type of b)(b+1)
              print(b)//11
         */

        byte b=10;
        ++b;
        System.out.println("Byte b : "+b);

        short s=11;
        ++s;
        System.out.println("Short s: "+s);

        char c='a';
        ++c;
        System.out.println("Char c: "+c);

        int a=10;
        ++a;
        System.out.println("Int a: "+a);

        long l=10L;
        ++l;
        System.out.println("Long l: "+l);

        float f=3.14f;
        ++f;
        System.out.println("Float f: "+f);

        double d=10.19;
        ++d;
        System.out.println("Double d: "+d);
    }
}
