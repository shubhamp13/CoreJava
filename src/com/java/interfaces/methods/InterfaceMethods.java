package com.java.interfaces.methods;

public interface InterfaceMethods
{
    /*
        1.All Methods Inside interface are by default public abstract

        *****************************************************************
        Why interface methods are public abstract by default?
        ****************************************************************
        1.Public
               Interface methods will be implemented by implementing class
               so interface methods should be accessible to the implementing class
               Hence Interface methods are public by default
        2.abstract:
                As Interface is Nothing Service required specification (SRS) so methods
                does not have implementation so that interface methods are abstract by default

        Note:
            (1) As interface methods are public abstract we can not make methods as
                    a.private
                    b.protected
                    c.default
                    d.static
                    f.strictfp
                    g.final
                    h.native
                    i.synchronized
     */
    public static void main(String[] args)
    {
        System.out.println("Interface Methods:");
        System.out.println("\t1.Inside Interface all methods are public abstract by default whether we\n" +
                "\t mention or not");
        System.out.println("\t2.Inside Implementing class we have to mention method as public only\n" +
                "\t Otherwise we will get compile time error");
        System.out.println("\n\t Why Interface Methods are public abstract by default ?");
        System.out.println("\t public: methods of the interface will be implemented in implementing class\n" +
                "\t so to access all the interface methods they are public by default\n");
        System.out.println("\t abstract: As Interface is Service Requirement specification so all the methods\n" +
                "\t in that will not have implementation so all the methods inside interface are abstract\n" +
                "\t by default");
        System.out.println("\nNote:");
        System.out.println("As Interface methods are public by default then we can not use modifier\n" +
                "\t such as:");
        System.out.println("\t\t1.private\n");
        System.out.println("\t\t2.protected\n");
        System.out.println("\t\t3.default\n");
        System.out.println("\nAs Interface Methods are abstract by default then we can not use\n" +
                "\t modifiers such as:");
        System.out.println("\t\t1.static\n");
        System.out.println("\t\t2.final\n");
        System.out.println("\t\t3.native\n");
        System.out.println("\t\t4.synchronized\n");
        System.out.println("\t\t5.strictfp");
    }
}
