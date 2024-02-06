package com.java.flowcontrolstatements.switchstatements;

public class Case3
{
    public static void main(String[] args)
    {
      /*
        Every Case Label Must be in the range of given switch argument.
        Ex:
        if switch argument is of type byte then case label must be in the range of -128 to 127
        only otherwise we will get compile time error
       */
        {
            byte b=10;
            switch (b)
            {
                case 10:
                case 100:
                //case 1000:--> This Case Label is out of range for byte so we will get CTE
            }
        }
        {
            byte b=10;
            switch (b+1)//--->max(int,byte,int)--->int(Result of b+1 is of int type only)
            {
                case 10:
                case 100:
                case 1000://so switch argument expression result is of int type so it is perfectly valid
            }
        }
    }
}
