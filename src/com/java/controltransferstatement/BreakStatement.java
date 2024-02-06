package com.java.controltransferstatement;

public class BreakStatement
{
    public static void main(String[] args)
    {
        /*
            we can use break statement to transfer the control of execution
            **We can Use Break Statement In following statements
                1.switch
                2.loop
                3.Labeled block
             ********************************************************************
             If We try to use break outside switch ,loop or Labeled block then
             we will get compile time error saying
             "break outside switch ot loops"
             **********************************************************************
         */
        {
//            case1:switch statements
            int x=0;
            switch (x)
            {
                case 0:
                    System.out.println(0);
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                default:
                    System.out.println("def");
            }
        }


        {
//            case2: Inside Loops
            for (int i=0;i<10;i++)
            {
                if (i==5)
                    break;
                System.out.println(i);
            }
        }


        {
//            case3:Inside Labeled Blocks
            System.out.println("Inside Main Method");
            int x=10;
            l1:
            {
                System.out.println("Start Of Block");
                if(x==10)
                    break l1;
                System.out.println("End Of Block");
            }
            System.out.println("Last Statement of Main Method");
        }
    }
}
