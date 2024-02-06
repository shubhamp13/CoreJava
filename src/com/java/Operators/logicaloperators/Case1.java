package com.java.Operators.logicaloperators;
public class Case1
{
    public static void main(String[] args)
    {
        {
            /*
                In Bitwise and (&) Operator both operand must be evaluated
                First.
                So in Below Example
                ++x < 10-->11<10-->false
                ++y>15 -->16>15-->true
                false & true --> false
                ++y=(y=16)-->17
                x=11
                y=17
             */
            int x=10,y=15;
            if(++x < 10 & ++y>15)
            {
                ++x;
            }
            else
            {
                ++y;
            }
            System.out.println("X: "+x+" Y: "+y);
        }

        {
            /*
                In Logical And (&&) Operator If First Operand is only false
                then it will not evaluate second operand
                In Below Example

                ++x < 10 --> 11<10 false
                ("Here First Operand Only false So second operand is not evaluated)
                ++y=16
                x=11
                y=16
             */
            int x=10,y=15;
            if(++x < 10 && ++y>15)
            {
                ++x;
            }
            else
            {
                ++y;
            }
            System.out.println("X: "+x+" Y: "+y);
        }
        {
            /*
                In Bitwise OR(|) Operator both operand must be evaluated
                First.
                So in Below Example
                ++x < 10-->11<10-->false
                ++y>15 -->16>15-->true
                false & true --> false
                ++x=(x=11)-->12
                x=12
                y=16
             */

            int x=10,y=15;
            if(++x < 10 | ++y>15)
            {
                ++x;
            }
            else
            {
                ++y;
            }
            System.out.println("X: "+x+" Y: "+y);
        }
        {
             /*
                In Logical OR (||) Operator If First Operand is only true
                then it will not evaluate second operand
                In Below Example

                ++x < 10 --> 11<10 false
                ("Here First Operand is false So second operand is  evaluated)
                ++y=16
                x=11
                y=16
             */
            int x=10,y=15;
            if(++x < 10 || ++y > 15)
            {
                ++x;
            }
            else
            {
                ++y;
            }
            System.out.println("X: "+x+" Y: "+y);
        }
    }
}
