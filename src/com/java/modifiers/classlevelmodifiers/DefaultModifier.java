package com.java.modifiers.classlevelmodifiers;

public class DefaultModifier
{
    /*
        1.if no modifier is declared then it is treated as default modifier
        2.if class is declared as default modifier then we can access that class within
        same package,we can not access that class outside the package

       3. default level modifier is also known as package level modifier

     */
    public static void main(String[] args)
    {
        System.out.println("If a class declared with default modifier the we can access that class \n" +
                "within same package,but we can not access that class from outside the package");
        System.out.println("\n\nDefault Modifier is also known as package level modifier");
    }
}
