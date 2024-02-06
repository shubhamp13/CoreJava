package com.java.literals;

public class EscapeCharcters
{
    public static void main(String[] args)
    {
        char c1='\n';
//        System.out.println("This Is New Line Escape Charcter"+c1);

        char c2='\t';
//        System.out.println("This is Horizantal Tab Charcter"+c2+"Makes Horizantal Space");

        char c3='\r';
        System.out.println(c3+" It will act as");

        char c4='\b';
        System.out.println("It willl"+c4+" delete last character");

        char c5='\f';
        System.out.println("Shubham"+c5);

        char c6='\'';
        System.out.println("shubham "+c6+"Puri"+c6);

        char c7='\"';
        System.out.println("Shubham "+c7+"Puri"+c7);
        char c8='\\';
        System.out.println("C:"+c8+"Program Files"+c8+"Java"+c8+"jdk-17"+c8+"bin"+c8+"java.exe");
    }
}
