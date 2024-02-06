
package com.java.flowcontrolstatements.iterativestatements;
import java.lang.Iterable;
public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        /*
           1.for each loop was introduced in JDK 1.5V
           2.for each loop is also known as Enhanced for loop
           3.for each loop is best for retrieving elements fro
                a.arrays
                b.collections
         */
//        {
//            //For One Dimensional Array
//            int []x={1,2,3,4,5};
//            for (int i=0;i<x.length;i++)
//            {
//                System.out.println(x[i]);
//            }
////        for (int x1:x)
////        {
////            System.out.println(x1);
////        }
//        }


        {
            // for two dimensional array
            int [][]a={{1,2,3},{4,5,6},{7,8,9}};
//            for (int i=0;i<a.length;i++)
//            {
//                for (int j=0;j<a[i].length;j++)
//                {
//                    System.out.println(a[i][j]);
//                }
//                System.out.println();
//            }


//            for(int []x1:a)
//            {
//                for (int x2:x1)
//                {
//                    System.out.println(x2);
//                }
//            }
        }

            {
                // for three dimensional array
                int [][][]b={{{1,2,4}},{{11,12,13}}};
//                for (int i=0;i<b.length;i++)
//                {
//                    for (int j=0;j<b[i].length;j++)
//                    {
//                        for (int k=0;k<b[i][j].length;k++)
//                        {
//                            System.out.println(b[i][j][k]);
//                        }
//                    }
//                    System.out.println();
//                }


//                for(int [][]x1:b)
//                {
//                    for (int []x2:x1)
//                    {
//                        for (int x3:x2)
//                        {
//                            System.out.println(x3);
//                        }
//                    }
//                }
            }
    }
}
