package com.java.modifiers.transientmodifier;

public class TransientModifier
{
    /*
        transient modifier:
            1.transient modifier is only applicable for variables
            2.we can not apply transient modifier anywhere else
            3.transient modifier is used in serialization context

            4.serialization:serialization means converting object into
                             byte streams or save the object in local memory

            5.deserialization:deserialization means converting byte streams back
                               to the java object known as deserialization

            6.when we have object of login credentials which contains username and password
            if we do not want to store the password to the local memory then we can make
            password variable as transient that variable default value will be stored not
            original.while deserialization username will be passed and password will be as null

            7.At the time of serialization JVM ignores the value of variable which is declared
            as transient and its default value will be stored

            8.transient means not to serialize.
     */
    public static void main(String[] args)
    {
        System.out.println("transient modifier:");
        System.out.println("\t1.transient modifier is only applicable for variable\n");
        System.out.println("\t2.We can not use transient modifier anywhere else\n");
        System.out.println("\t3.transient modifier mostly used in serialization context");
        System.out.println("\t4.serialization:-->serialization means converting java object" +
                "\n\t into byte streams or saving it into local machine\n");
        System.out.println("\t5.deserialization: deserialization means when byte stream is\n" +
                "\t converted back to the original java object\n");
        System.out.println("\t6.transient modifier also used for not to serialize\n");
        System.out.println("\t7.If we have an object of login credentials which have\n" +
                "\t username and password as members.\n" +
                "\t if we want to save object to the local machine but we dont want to\n" +
                "\t store password then we will make password as transient\n" +
                "\t when we are made password as transient then password will be saved\n" +
                "\t as default value to the serializable file\n");
        System.out.println("\t8.JVM will ignore the value of variable which has transient\n" +
                "\t modifier while serialization process and store its value default\n" +
                "\t by corresponding data type\n");
        System.out.println("\t9.While deserialization the new object copy will be created\n" +
                "\t and username will be same and password will be null\n");
        System.out.println("\t10.with the help of transient modifier we will achieve\n" +
                "\t security to our data");

    }
}
