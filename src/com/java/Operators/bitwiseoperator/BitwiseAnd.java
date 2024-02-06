package com.java.Operators.bitwiseoperator;

public class BitwiseAnd
{
    public static void main(String[] args)
    {
        /*
            There are following bitwise operators
            1.&-->AND--> "It Returns True If Both arguments are true"

            2.|-->OR--> " It Returns True if any one argument is True"

            3.^ ---> XOR--> " It returns True If Both Arguments Are Different"

         */
        System.out.println(true & false);//--->false--->("If Both operators are true then only it returns true")
        System.out.println(true | false);//-->true--->("If any one operator is true then it returns true")
        System.out.println(true ^ false );//--->true---("in xor both operand must be different")
    }
}
