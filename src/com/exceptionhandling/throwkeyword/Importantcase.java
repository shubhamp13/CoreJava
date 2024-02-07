package com.exceptionhandling.throwkeyword;

public class Importantcase
{
    public static void main(String[] args)
    {
        System.out.println("If You are throwing any checked exception that exception must be\n" +
                "\t handled otherwise code will not compile");
//        throw new Exception();
        System.out.println("As Exception is checked exception");
    }
}
class Test
{
    public static void main(String[] args)
    {
        throw new RuntimeException();
    }
}
