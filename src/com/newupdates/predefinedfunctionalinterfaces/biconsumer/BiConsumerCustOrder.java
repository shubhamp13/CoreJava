package com.newupdates.predefinedfunctionalinterfaces.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;


public class BiConsumerCustOrder
{
    public static void main(String[] args)
    {
        BiFunction<String,String,Customer>f1=(s1,s2)->new Customer(s1,s2);
        BiFunction<String,Double,Order>f2=(s1,d1)->new Order(s1,d1);
        Customer c1=f1.apply("Shubham","shubhampuri8297@gmail.com");
        Customer c2=f1.apply("Sejal","sejalpatankar9@gmail.com");
        Order o1=f2.apply("Pizza 3",850.00);
        Order o2=f2.apply("Sandwich",654.00);
        BiConsumer<Customer,Order>consumer=(c,o)->
        {
            System.out.println("Customer Name: "+c.getCustName());
            System.out.println("Customer Email: "+c.getCustEmail());
            System.out.println("Order ID: "+o.getOrederId());
            System.out.println("Order Price"+o.getPrice());
            System.out.println("-------------------------------------------------");
        };
        consumer.accept(c1,o1);
        consumer.accept(c2,o2);




    }
}
