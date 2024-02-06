package com.java.modifiers.classlevelmodifiers;

public class AbstractModifier
{
    /*
        (abstract:incomplete)
        abstract is a modifier which is only applicable for
            1.class
            2.method

       1.abstract Method:
                1.If we do not know the implementation of the method then we can declare method as
                abstract.
                2.If class contains at least one abstract method then it is mandatory to declare that
                class as abstract
                3.We can not give implementation to method which is declared as abstract
*****************************************************************************************************************
                         **Valid abstract declarations**
                    public abstract void m1();----->valid declaration
                    public abstract void m1(){}------>Invalid declaration
************************************************************************************************************************

                4.if method is declared as abstract then its implementation can be given by
                its child class if child class also not given implementation ,then that child
                class also declared as abstract

                5.abstract method concepts never speaks about implementation if any modifier speaks
                about implementation then its combination is illegal

                example
                1.public abstract final void m1();----> Its illegal combination as final method must have
                                                        implementation but abstract method does not have
                                                         implementation then combination of these two modifiers
                                                         are illegal

                2.public abstract native void m1()----> native modifier is used when we have a method from another
                                                        language such as c or c++
                                                        Its illegal combination as native method must have
                                                        implementation in its own language but abstract method does not
                                                        have implementation then combination of these two modifiers
                                                         are illegal

                3.public abstract strictfp void m1()---> Its illegal combination as strictfp("Strict floating point IEEE 754")
                                                         method must have implementation ,whereas
                                                         abstract method does not have implementation then combination
                                                         of these two modifiers are illegal

               4.public abstract static  void m1()-----> Its also illegal combination as static method must have
                                                         implementation and abstract method can not have implementation
                                                         then combination of static and abstract is illegal

               5.public abstract synchronize void m1()----> illegal combination

               6.private abstract void m1()------>We can not override private method so we can not give new implementation
                                                  to abstract method so its illegal combination
*****************************************************************************************************************************************




     */
    public static void main(String[] args)
    {
        System.out.println("If we dont know implementation of method then we can declare that method as abstract");
        System.out.println("\n2.If method is declared as abstract then we can not give implementation to that method in" +
                "that class");
        System.out.println("public abstract void m1();---->Its Valid declaration");
        System.out.println("public abstract void m1(){}----->Its Invalid declaration");

        System.out.println("\n3.If a class contains at least one abstract method then we should declare that class as" +
                "\n abstract");
        System.out.println("\n**********Important*********************");
        System.out.println("1.If any modifier states about implementation then combination of abstract and that modifier is" +
                "\nillegal");
        System.out.println("\n**********Important*********************");
        System.out.println("1.public final abstract void m1();---->Illegal combination");
        System.out.println("2.public static abstract void m1();------>illegal combination");
        System.out.println("2.public strictfp abstract void m1();------>illegal combination");
        System.out.println("2.public synchronized abstract void m1();------>illegal combination");
        System.out.println("2.private abstract void m1();------>illegal combination");




    }
}
