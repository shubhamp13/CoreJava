package com.java.flowcontrolstatements.switchstatements;

public class Case1
{
    public static void main(String[] args)
    {
        /*
            When several options are available then it is  not recommended to use if else statement
            in Program because it will reduce the readability of code

            We should use switch statement instead of if else.

            Allowed data types in switch statements are:
            **************From JDK1.4 Version****************************
            1.byte                                                      *
                                                                        *
            2.short                                                     *
            3.char                                                      *
            4.int                                                       *
            ***************From JDK 1.5 Version**************************
            ("Wrapper Classes of their primitive types)                 *
            1.Byte                                                      *
            2.Short                                                     *
            3.Character                                                 *
            4.Integer                                                   *
            5.enum                                                      *
            ****************From JDK 1,7 Version*************************
            1.String                                                    *
            **************************************************************

           ****************************Important Questions*****************
            Q1.Why boolean is not allowed?
            Ans: If Boolean is allowed then there will be only two cases either true or false
            so it is just like if else.so it is better to use if else only rather than boolean
            switch case.So that Boolean is Not Allowed in  switch

            Q2.Why long is not allowed?
            Ans:switch allows int data type.Range of int is (-2147483648 to 2147483647),
            So there is impossible to use more than cases than int range only,hence long data
            type also not allowed in switch

            Q2.Why float,double is not allowed?
            Ans:The Values between 0 to 1 is infinity so its impossible to allow infinity cases in
            switch.hence float and double not allowed in switch statements
         */

        /*
            Conclusion 2:
            1."Curly Braces Are Mandatory In switch statements"
            2.Except switch statements curly braces are optional
            3.case and default in switch statement are optional
            4.Empty Switch statement is valid syntax in java program

         */
        int a=0;
        switch (a)
        {

        }
        /*
            Inside Switch every statement must be under case or default
            otherwise we will get Compile Time Error
            int x=0;
            switch(x)
            {
                System.out.println("Hello");
            }
            Compile Time Error:
            case,default or } expected

         */
    }
}
