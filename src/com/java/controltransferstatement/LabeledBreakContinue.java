package com.java.controltransferstatement;

public class LabeledBreakContinue
{
    public static void main(String[] args)
    {
       l1: for (int i=0;i<10;i++)
        {
          l2:  for (int j=0;j<10;j++)
            {
                for (int k=0;k<10;k++)
                {
                    if(i==5)
                        break l1;
                    System.out.println("("+i+","+j+" , "+k+" )");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
