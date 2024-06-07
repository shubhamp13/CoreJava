package com.langpackage.String.methods.conclusions;

//How To Create Our own immutable class ?
final public class Test
{
    private int i;

    public Test(int i)
    {
        this.i = i;
    }
    public Test modify(int i)
    {
        if(this.i==i)
        {
            return this;
        }
        else
        {
            return new Test(i);
        }
    }

    public static void main(String[] args)
    {
        Test t1 = new Test(1);
        Test t2 = t1.modify(100);
        Test t3 = t1.modify(1);
        System.out.println(t1==t2);
        System.out.println(t1==t3);

    }
}
