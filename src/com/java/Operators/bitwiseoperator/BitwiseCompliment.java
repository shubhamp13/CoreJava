package com.java.Operators.bitwiseoperator;

public class BitwiseCompliment
{
    public static void main(String[] args)
    {
        /*
            Bitwise Complement can not be applied to boolean type
            1.Memory representation of any value have a most significant bit
            2.Most significant bit represents sign (+ve or -ve) of value
            3.In Most Significant bit 0 represents Positive value
            4.1 represents negative value
            5.Representation of negative value in memory is done with 2'S
            Compliment not directly as Positive value

            Example:
             4--->(Binary Form)--->0100
             As int have 32 bits so other bits are filled with 0
             representation of 4
             [0](MSB)0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0
      ~4-->  [1](MSB)1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1

        Representation of negative number is in 2's compliment so
          [1](MSB)1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 1 1
          ____________________________________________________________________________
        1'S COmp->0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0
        2'S Comp->                                                          + 1
        ____________________________________________________________________________
                  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1
         _____________________________________________________________________________
         [1](MSB) 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1

         0101--> 1*(2^0)+0*(2^1)+1*(2^2)
            --> 1*2+0+4
            -->5
        MSB -->-5

        So ~4 ---> -5



            */
        System.out.println(~4);

    }
}
