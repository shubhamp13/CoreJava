package com.langpackage.objectclass.clone.deepcopy;

public class Person implements Cloneable
{
    String name;
    int age;
    Aadhaar aadhaar;

    public Person(Aadhaar aadhaar, int age, String name)
    {
        this.aadhaar = aadhaar;
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        Aadhaar aadhaar1=new Aadhaar(aadhaar.aadhaarNo);
        Person person1=new Person(aadhaar1,age,name);
        return person1;
//        return super.clone();
    }
}
