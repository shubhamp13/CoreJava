package com.langpackage.objectclass.clone.deepcopy;

public class PersonAadhaar
{
    public static void main(String[] args) throws Exception
    {
        Aadhaar aadhaar=new Aadhaar(9631);
        Person person=new Person(aadhaar,24,"Shubham Puri");
        Person person2=(Person) person.clone();
        person2.aadhaar.aadhaarNo=963001;
        System.out.println(person.aadhaar.aadhaarNo);
        System.out.println(person2.aadhaar.aadhaarNo);
    }
}
