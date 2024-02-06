package com.java.interfaces.introduction;

public class IntroductionInterface
{
    /*
        Interface:
            1.Definition:
                    "Any Service requirement specification is considered as interface"
                    Example 1:
                       JDBC API("Java Database Connectivity Application Program Interface)
                       is an interface provided by SUN peoples where database vendors implements
                       and create there specific drivers for database connectivity.
                       example:
                        1.Oracle Driver
                        2.Mysql Driver
                        3.DB2 Driver

                     Example 2:
                        Servlet API is an Interface provided by SUN peoples where web server
                        vendors can implement to create there Web Servers

                        Example:
                                1.APACHE Tom Cat server
                                2.ORACLE Web logic server
                                3.IBM Web Sphere Server

            2.Definition:
                    "Contract between service provider and client is known as interface"

            3>Definition:
                        "Inside Interface Every Method is by default abstract hence interface
                        is known as 100 % pure abstract class"
        ***************************************************************************************
        Final Definition:
                "Any Requirement specification or Any contract between client and service provider
                or 100 % pure abstract class is known as interface
      *************************************************************************************************
     */
    public static void main(String[] args)
    {
        System.out.println("interface:");
        System.out.println(" Definition 1:");
        System.out.println("*********************************************************************************************");

        System.out.println("\t Any Service Requirement specification (SRS) is known as interface\n");
        System.out.println("*********************************************************************************************");

        System.out.println("\tExample 1:");
        System.out.println("\t\t JDBC API (Java Database Connectivity Application program interface) is an interface\n" +
                "\t\t provided by SUN people where Database Vendors can implement JDBC API and Create their Own Drivers\n");
        System.out.println("\t\t\tExample:1.ORACLE driver");
        System.out.println("\t\t\t        3.MYSQL driver");
        System.out.println("\t\t\t        3.DB2 driver\n");

        System.out.println("\tExample 2:");
        System.out.println("\t\t Servlet API is an Interface provided by SUN peoples where web server vendors can implement\n" +
                "\t\t and Create there Own servers");
        System.out.println("\t\t\tExample:1.Apache Tomcat Server");
        System.out.println("\t\t\t        2.Oracle Web Logic Server");
        System.out.println("\t\t\t        3.IBM Web Sphere Server\n");
        System.out.println("Definition 2:");
        System.out.println("*********************************************************************************************");

        System.out.println("\t Any Contract Between Client and Service Provider Is known as Interface");
        System.out.println("*********************************************************************************************");

        System.out.println("\nDefinition 3:");
        System.out.println("\t\t All methods in an interface are by default abstract so 100 % pure abstract is known as\n" +
                "\t\t Interface");
        System.out.println("\n*********************************************************************************************");
        System.out.println("Final Definition");
        System.out.println("*********************************************************************************************");

        System.out.println("\n\t Any Service Requirement Specification or Any Contract between client and service provider \n" +
                "\t or 100 % Pure Abstract  class is known as interface");
        System.out.println("*********************************************************************************************");

    }
}
