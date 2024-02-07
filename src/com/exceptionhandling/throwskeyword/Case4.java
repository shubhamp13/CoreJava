package com.exceptionhandling.throwskeyword;

public class Case4
{
    public static void main(String[] args)
    {
        System.out.println("Inside catch block if there is partially checked exception and unchecked\n" +
                "\t exception then it is not mandatory that there must be any code which will raise\n" +
                "\t exception");
        try {
            System.out.println("Hello");
        }
        catch (Exception e)
        {

        }
    }
}
class Demo
{
    static
    {
        //System.out.println(x);direct access will give compile time error illegal forward reference
        indirectAccess();//indirect access is valid
    }
    public  static  void indirectAccess()
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
    }
    static  int x=10;
}
