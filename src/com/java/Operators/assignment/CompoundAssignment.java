package com.java.Operators.assignment;

public class CompoundAssignment
{
    public static void main(String[] args)
    {
        {
            byte b=10;
//            b=b+1;
            System.out.println(b);
            /*
                In The Above Example we will get CTE saying
                Incompatible types:int can not be converted to byte
                b = b+ 1
                max(int,type of b,type of 1)-->(int,byte,int)-->int
                so int can not be assigned to byte implicitely
             */
        }

        {
           byte b=10;
           b++;
            System.out.println(b);
            /*
                In Above Example b++ means -->b=(byte)(b+1)
                Here Typecasting is done implicitely by the compiler only

             */
        }

        {
            byte b=127;
            b+=3;
            System.out.println(b);
            /*
                In Above Example byte b=127
                            b+=3
                            b=(byte)(b+3)
                            b=(byte)(130)
                            b=-126
                            Internally Typecasting is done by the compiler
             */
        }
    }
}
