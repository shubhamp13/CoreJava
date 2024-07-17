package com.newupdates.lambdaexpressions.interfaces;

public interface InterfAnonymous
{
    public void show();
}
class Demo
{
    int x=777;
    public void m2()
    {
        int a=100;
        final int b=200;
        InterfAnonymous i1=()->
        {

                int x=888;
                System.out.println(x);
                x=999;
            System.out.println(x);
                System.out.println(this.x);
                this.x=7277;

        };
        i1.show();

    }
    public static void main(String[] args)
    {
        Demo demo=new Demo();
        demo.m2();
    }
}
class Demo2
{
    public static void main(String[] args)
    {
        int x=100;
        InterfAnonymous i3=()->{
            int i=100;
//            x=200;
            System.out.println(i);
        };
    }
}
