package com.newupdates.predefinedfunctionalinterfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class BiFunctionObject
{
    public static void main(String[] args)
    {
        BiFunction<String,Double,Car>f=(a,b)->new Car(a,b);
        Car c1=f.apply("Tata Nexon",1000000.0);
        Car c2=f.apply("Tata Harrier",2000000.0);
        Car c3=f.apply("Range Rover",5000000.0);
        Consumer<Car>c=s->
        {
            System.out.println("Model Name: "+s.getModel());
            System.out.println("Price: "+s.getPrice());
            System.out.println("-------------------------------------------------------------");
        };
        c.accept(c1);
        c.accept(c2);
        c.accept(c3);
    }
}
