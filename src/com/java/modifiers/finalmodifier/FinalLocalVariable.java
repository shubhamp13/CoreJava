package com.java.modifiers.finalmodifier;

public class FinalLocalVariable
{
    /*
      Local Variable:
          1.The Variable declared inside block other than class block are known as local
          variables
          2.The variables declared inside
              a.method
              b.constructor
              c.block
          are known as local variables or Temporary variables or Stack Variables
          or Automatic variables

          3.Local Variables are not initialized with default values by jvm
          we have to initialize it explicitly before using local variable
          that is if we are not using local variable then its not mandatory
          to initialize it
         ********************************************************************************************

         Final Local Variable:
          1.If local variable is declared as final then we have to initialize it before using the local final
          variable that is if we are not using that local final variable then it is not necessary to initialize it

          2.The only applicable modifier for local variable is final,other than final modifier
          we can not use to local variable otherwise we will get compile time error

         ********************************************************************************************************

         Formal parameters:
          1. formal parameters of a method is local variable to that method
          2.formal parameters of a method can be final
          3.if formal parameters of a method is final then we can not
           reinitialize the variables otherwise we will get compile time error
           ********************************************************************************************************
   */
    public static void main(String[] args)
    {
        System.out.println("*******************************************************************************************");

        System.out.println("Local Variable:");
        System.out.println("\t1.If a variable declared inside block other than class block are known as local" +
                "\n\t variable");
        System.out.println("\t2.The Variable declared inside\n\t\t1.Method\n\t\t2.constructor\n\t\t3.Block\n\tare known as" +
                "local variables");
        System.out.println("\t3.local variables will not be initialized with default values by JVM we have to initialize\n" +
                "\t it explicitly before the use of local variable that is if local variable is not used then it is not \n" +
                "\t necessary to initialize the local variable");

        System.out.println("*******************************************************************************************");
        System.out.println("\nFinal Local variable:");
        System.out.println("\t1.if local variable is declared as final then we have to initialize it explicitly before using" +
                "\n\t the final local variable that is if we are not using final local variable then it is not necessary" +
                "\n\t to initialize it");

        System.out.println("\t2.The Only allowed modifier for local variable is final if we try to use other modifier\n" +
                "\t to local variable then we will get compile time error");

        System.out.println("******************************************************************************************");
        System.out.println("Formal Arguments:");
        System.out.println("\t1.Formal Arguments of the method is local variable to that method");
        System.out.println("\t2.Formal arguments can be final");
        System.out.println("\t3.If formal arguments of the method is final then we can not initialize the\n" +
                "\t  variables again otherwise we will get compile time error");
        System.out.println("*******************************************************************************************");
    }
}
