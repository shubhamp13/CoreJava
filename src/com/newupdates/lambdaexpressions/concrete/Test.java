package com.newupdates.lambdaexpressions.concrete;

import com.newupdates.lambdaexpressions.implementations.Demo1;
import com.newupdates.lambdaexpressions.implementations.InterfStringImpl;
import com.newupdates.lambdaexpressions.implementations.SquareImpl;
import com.newupdates.lambdaexpressions.interfaces.InterfDisplay;
import com.newupdates.lambdaexpressions.interfaces.InterfSquare;
import com.newupdates.lambdaexpressions.interfaces.InterfString;

public class Test
{
    public static void main(String[] args)
    {
        Demo1 demo1 = new Demo1();
        demo1.display();
        InterfDisplay i=()-> System.out.println("Hello From Lambda expresiions");
        i.display();

        SquareImpl square = new SquareImpl();
        System.out.println(square.square(10));
        InterfSquare i2=x->x*x;
        System.out.println(i2.square(20));

        InterfStringImpl str = new InterfStringImpl();
        System.out.println(str.name("Shubham Puri"));
        InterfString i4= str1->str1;
        System.out.println(i4.name("Shubham Pandit Puri"));

    }
}
