package com.langpackage.wrapperclasses.autoboxing;

public class Case1
{
    public static void main(String[] args)
    {
        //1.Wrapper Objects are immutable.If we create wrapper Object then we can not perform any changes
        //if we tries to perform any changes then with that changes new Object will be created
        Integer I=10;
        Integer II=I;
        I++;
        System.out.println(I);//11
        System.out.println(II==I);//false
    }
}
