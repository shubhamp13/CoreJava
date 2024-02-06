package com.java.interfaces.adapaterclass;

public class AdapterI1 implements I1
{
    @Override
    public void m1() {

    }
    @Override
    public void m2() {

    }
    @Override
    public void m3() {

    }
    @Override
    public void m4() {

    }
    @Override
    public void m5() {

    }
    @Override
    public void m6() {

    }
    @Override
    public void m7() {

    }
    @Override
    public void m8() {

    }
    @Override
    public void m9() {

    }
    @Override
    public void m10() {

    }
    @Override
    public void m11() {

    }
    @Override
    public void m12() {

    }
    /*
        Adapter Class:
                    1.Adapter Class is simple java class which implements all the interface methods
                    as empty implementation

                    2.If we implement an interface then compulsory we have to implement all the methods
                    of that interface in the class whether we require or not by this code readability
                    decreases


                    3.to solve this problem we can create a class which will have all the implementation
                    of interface methods as empty and we should make this class as adapter class

                    4.Instead of implementing interface we can extend class which have already empty
                    implementation of interface methods so that we do not have to worry about other methods
                    we can give implementation to only required method

                    Example:
                    1.Servlet is an interface which have  five methods.
                    2.GenericServlet is an abstract class which implements Servlet and have all
                    the methods implementation except service method
                    3.HTTPServlet is an abstract class which extends GenericServlet which have all
                    the implementation of Servlet interface
                    4.If we create myServlet and implements Servlet then compulsory we have to provide
                    all the methods which are present inside Servlet interface
                    5.Instead of implementing Servlet ,if we extend GenericServlet class then we have to
                    implement only one method which is service()
                    6.So we can say that GenericServlet acts as an Adapter class

                    Imp
                    With the help of Marker interface and Adapter class the complexity of the programming
                    decreases and readability increases
     */

    public static void main(String[] args)
    {
        System.out.println("Adapter Class:");
        System.out.println("\t1.Adapter class is simple java class which implements all the methods of\n" +
                "\t an interface as empty");
        System.out.println("\t2.If we implements an interface then compulsory we have to provide\n" +
                "\t implementation to methods of an interface whether we required or not\n");
        System.out.println("\3.If we create a class which will implement all interface methods as empty\n" +
                "\t that class is adapter class and we should make it as abstract");
        System.out.println("\t.with the help of adapter class if we extend adapter class then we \n" +
                "\t can give implementation to the required method only,we do not require to worry about\n" +
                "\t other methods this will increases code readability\n");
        System.out.println("Example:\n");
        System.out.println("\t1.Se rvlet is an interface which have 5 methods\n");
        System.out.println("\t2.GenericServlet is an Abstract class which implements Servlet Interface\n" +
                "\t and GenericServlet have all the method implementation of Servlet interface except\n" +
                "\t service() method\n ");
        System.out.println("\t3.HTTPServlet is an abstract class which extends GenericServlet and \n" +
                "\t which have all the implementation of methods of Servlet interface");
        System.out.println("\t4.We can develop a Servlet in three ways:");
        System.out.println("\t\t1.By Implementing Servlet Interface:");
        System.out.println("\t\t\t In this we have to give implementation to all the methods of\n" +
                "\t Servlet interface it will reduce code readability");
        System.out.println("\t\t2.By Extending GenericServlet abstract class:");
        System.out.println("\t\t\t in this we have to give only one method implementation");
        System.out.println("\t\t3.By Extending HTTPServlet\n");
        System.out.println("\t So,We can say that GenericServlet acts as an Adapter class\n");
        System.out.println("Note:\n");
        System.out.println("1.Marker Interface and adapter class reduces the complexity of the\n" +
                "\tprogramming and code readability will increase so its is big advantage to have \n" +
                "\t adapter class and marker interface");
    }
}
