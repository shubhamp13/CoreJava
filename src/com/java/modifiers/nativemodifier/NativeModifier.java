package com.java.modifiers.nativemodifier;

public class NativeModifier
{
    /*
        native modifier:
            1.native modifier is only applicable to methods
            2.we can not apply native modifier anywhere else
            3.If we want to use methods which are already present in old languages like (C or C++)
            then we should use native modifier
            4.we use native methods to increase performance as performance of java is not for critical sections are
            not high-so we have to use c or c++ language methods to increase performance of the application
            5.As java language can not directly communicate with machine so some operations may require direct
            communications with machine level so to achieve machine level communications we require native methods

            6.pseudocode  for native methods:
                                    class Native
                                    {
                                        static
                                        {
                                            System.loadLibrary("library name");
                                        }
                                          public  native  void m1();
                                     }

                                    class Test
                                    {
                                        public static void main(String[] args)
                                        {
                                            Native n1=new Native();
                                            n1.m1();
                                        }
                                    }
           7.steps:
                   1.we have to load the path of native library before the complete process of class
                   loading process so that we have to load native library path in static block

                   2.we have to declare native method,as native method already have implementation in other
                   languages so, we have to just declare native method we can not give implementation to native methods
                   so native method always ends with semicolon(;)

                   3.then we can create instance of the class and call the native method


          8.The advantage of native method is performance of application will be increased
          and with the help of native methods we can directly communicate at system level

          9.The main disadvantage of native method is we have to use languages which are platform dependant
          so our platform independence will be lost

          10.The native method already have implementation in old languages such as(C or C++),but abstract method does
          not have implementation so combination of abstract native is illegal

          11.Old languages may or may not follow IEEE754 standards for floating point operations so declare method
          as strictfp native is illegal so combination of strictfp native is also illegal for methods
     */
    public static void main(String[] args)
    {
        System.out.println("native modifier:");
        System.out.println("\t1.native modifier can be only applicable for methods only\n");
        System.out.println("\t2.we can not apply native modifier anywhere else\n");
        System.out.println("\t3.When we have to use method which are already present inside old languages like (C or C++)\n" +
                "\t in our language then we use native modifier\n");
        System.out.println("\t4.As we know the performance of java language is not up too mark for critical sections\n" +
                "\t so to increase performance of our application we should use native methods\n");
        System.out.println("\t5.Java Language can not communicate directly with machine so to communicate directly with\n" +
                "\t machine then we have to use native methods\n");
        System.out.println("\t6.steps to use native methods:\n");
        System.out.println("\t\t1.first we have to add libraries to our program before complete execution of class loading\n" +
                "\t\t means we have to add libraries inside static block(System.loadLibrary(\"library name\");)\n");
        System.out.println("\t\t2.Then we have to declare native method as native method already have implementation in\n" +
                "\t\told languages like C or C++ then we have to declare native method with semicolon(;)");
        System.out.println("\t\t3.Create instance of the class and access that method\n");
        System.out.println("\t7.The Main advantage of native method is performance will be increased for applications\n");
        System.out.println("\t8.The Main disadvantages of native method is ,as old languages like C or C++ is platform\n" +
                "\t dependant then our platform independent nature will be loss\n");
        System.out.println("\t9.native method already have implementation in old languages like c or c++ but abstract\n" +
                "\t method does not have implementation so combination of abstract native is illegal\n");
        System.out.println("\t10.As old language may or may not support IEEE754 standards so combination of strictfp native\n" +
                "\t is illegal");

    }
}


