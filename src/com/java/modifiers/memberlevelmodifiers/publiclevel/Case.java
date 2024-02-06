package com.java.modifiers.memberlevelmodifiers.publiclevel;

public class Case
{
    /*
        member of class are
        1.method
        2.variable
      1.public modifier can be accessible from anywhere
      2.if method is declared as public but corresponding class is not declared as public
      then,we can not access that method from outside package
      3.To access method from outside package both class and method should be public
     */
    public static void main(String[] args)
    {
        System.out.println("Public member modifier:");
        System.out.println("Members are:\n\t1.variables\n\t2.methods");
        System.out.println("If member is declared as public then it is accessible from anywhere" +
                "\nbut if class is not public then we can not access that method outside package");
        System.out.println("To access members outside package the corresponding class and method\n" +
                "should be public");
    }
}
