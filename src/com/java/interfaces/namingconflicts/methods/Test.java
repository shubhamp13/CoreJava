package com.java.interfaces.namingconflicts.methods;

public class Test implements  I1,I2
{
    public void  m1()
    {
        System.out.println("Its Implementing both the method of I1 and I2\n");
    }
    public  void m2()
    {
        System.out.println("\t\tI1 interface method");
    }
    public void m2(int i)
    {
        System.out.println("\t\tI2 Interface method:"+i);
    }

    /*
        Interface Naming Conflicts:
        1.two interface can have methods with same name and same return type then inside implementation class
        we have to implement only one method

        2.two interface can have methods with same name but different formal arguments then we have to
        implement both the method inside implementing class these methods are overloading methods

        3.If two interface have methods with same signature but different return type then we can not implement
        two interface simultaneously otherwise we will get compile time error.("If return type are not co-variant)

        Question
            Is a java class can implement any no of interface simultaneously?
           Ans:
                Yes,Java class can implement any no of interfaces simultaneously but if two interface having method
                with same signature but different return type then its impossible to implement two interface
                simultaneously
     */

    public static void main(String[] args)
    {
        Test t1=new Test();
        System.out.println("Interface methods naming conflicts:\n");
        System.out.println("\t1.If two interface having methods with same signature and same return type then\n" +
                "\t we have to implement only one method inside implementation class");
        System.out.println("\t\t Example: as I1 and I2 interface have two methods with same signature and same return type\n" +
                "\t\t (m1()) method we have implemented only one method inside implementing class");
        System.out.print("\t");
        t1.m1();
        System.out.println("\t2. if two interface having methods with same name but different arguments then we have\n" +
                "\t to implement both the method in implementing class and these method inside implementing class are\n" +
                "\t known as overloaded methods\n");
        System.out.println("\t\t Example: As I1 and I2 interface having two methods of same name but different formal\n" +
                "\t\t argument (m2()method) we have implemented both methods in implementing class and these methods\n" +
                "\t\t inside implementing class are overloaded methods");
        System.out.println("\t\t Interface I1 method");
        t1.m2();
        System.out.println("\t\t Interface I2 method:");
        t1.m2(10);
        System.out.println();
        System.out.println("\t3.If two interface having methods with same signature and different return type then it is\n" +
                "\t impossible to implement two interfaces simultaneously");

        System.out.println("\n Is A java class can implement two interface simultaneously?");
        System.out.println("\nAnswer:");
        System.out.println("\t Yes,Java class can implement more than one interface simultaneously except when \n" +
                "\t two interface having methods with same signature but different return type then it is highly impossible\n" +
                "\t to implement two interface simultaneously");

    }
}
