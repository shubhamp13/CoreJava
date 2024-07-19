package com.newupdates.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class RemoveSpaces
{
    public static void main(String[] args)
    {
        Function<String,String>f=s->s.replaceAll(" ","");
        System.out.println(f.apply("Shubham Pandit Puri"));
    }
}
