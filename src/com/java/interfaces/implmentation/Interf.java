package com.java.interfaces.implmentation;

public interface Interf
{

    /*
        Interface declaration and implementation:
            Definitions:
                    1.Any Service Requirement Specification (SRS) Is Known as Interface
                    2.Any Contract Between client and service provider is known as Interface
                    3.All methods inside interface are by default public abstract hence 100 % Pure
                      abstract class is known as Interface

                    4.Any Service requirement specification  or any contract between client and service
                    provider or 100 % Pure Abstract class is known as interface

                    Example:
                    1.JDBC API is (Java Data Base Connectivity,Application Program Interface) is an Interface
                    Provided By SUN peoples through which database vendors can create their own drivers
                        Ex:(1) ORACLE JDBC Driver
                           (2) MYSQL JDBC Driver
                           (3) DB2 JDBC Driver

                   Example 2:
                    1 Servlet API is an interface provided by SUN people through which various Web server vendors
                    can implement there servers
                    Example:
                            (1) APACHE Tomcat Web Server
                            (2) ORACLE Web Logic Server
                            (3) IBM Web Sphere Server

               Interface Declaration and initialization:

               1.Interface contains all methods public abstract by default whether we declared or not
               2.Whenever we are implementing an interface all the methods of interface must be override in
               service provider class if service provider class does not implement at least one method then
               we have to make that class as abstract and responsibility to override method is now
               child class of service provider

               3.When we are overriding interface method then we have to make that method as public
               in service provider class otherwise we will get Compile Time Error
     */
    public static void main(String[] args)
    {
        System.out.println("\t1.Inside Interface all the methods are public abstract by default whether" +
                "\n\t we  are mentioning or not.In service provider class compulsory we have to provide" +
                "\n\t implementation to these abstract method otherwise we have to make service provider class\n" +
                "\t as abstract and next child will be responsible to override\n");
        System.out.println("\t2.While Overriding method of an interface we have to declare that method\n" +
                "\t as public as inside interface all the method are by default public otherwise we will\n" +
                "\t get compile time error");
    }
    void m1();
    void m2();

}
