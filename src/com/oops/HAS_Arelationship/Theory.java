package com.oops.HAS_Arelationship;

public class Theory
{
    public static void main(String[] args)
    {
        System.out.println("HAS-A relationship:");
        System.out.println("\t1.Its is an association between two or more classes where one class is\n" +
                "\t dependent on another class\n");
        System.out.println("\t2.HAS-A relationship is also known as Composition and Aggregation");
        System.out.println("\tComposition:");
        System.out.println("\t\t1.Its is association between two or more class where one class is \n" +
                "\t\t completely dependant on another class that means one class can not exist without\n" +
                "\t\t another this is strongly associated relationship known as Composition\n");
        System.out.println("\t\t2.Without Container class if there is no chance of existing contained object\n" +
                "\t then they are in strongly associated relationship known as Composition\n");
        System.out.println("\t\t3.In Composition contained object is present inside container class\n");
        System.out.println("\t\t4.We have to create dependant class object during the creation of container\n" +
                "\t\t class that means inside constructor or non-static initializer\n");
        System.out.println("\t\t5.University has departments,here departments can not exist without\n" +
                "\t\t university so they are strongly associated means Composition\n\n");

        System.out.println("\t Aggregations:");
        System.out.println("\t\t1.It is an association between two or more classes where one class is\n" +
                "\t\t not completely dependant on another that is one can exist without another this \n" +
                "\t\t type of weak association is known as aggregation\n");
        System.out.println("\t\t2.Without Container object if contained object can exist then it is\n" +
                "\t\t weakly associated known as Aggregations\n");
        System.out.println("\t\t3.In aggregation container object contains reference of contained object\n");
        System.out.println("\t\t4.In aggregation container object contains reference of dependent object\n" +
                "\t\t whenever we require the functionality then only we can create the object of \n" +
                "\t\t dependant class with the help of method known as Helper method\n");
        System.out.println("\t\t5.We have to create object of dependent class whenever we require\n" +
                "\t\t with the help of methods known as Helper methods\n\n");
        System.out.println("HAS-A VS IS-A Relationship");
        System.out.println("\t1.Whenever we require total functionality of class then we should\n" +
                "\t go for IS-A relationship\n");
        System.out.println("\t2.Whenever we requires partial functionality of class then we should go for\n" +
                "\t HAS-A relationship");
    }

}
