package com.java.Arrays;

public class Declaration
{
    public static void main(String[] args)
    {
        /*
        Array is collection of simillar type values which are stored in contigious memory allocation
         One Dimensional Array Declaration
         */
        {
            int[] b;//This Is Recommended
            int[] a;//This Is valid
            int c[];//This is also valid
        }

        /*
        Two dimensional array decleration
         */
        {
            int[][] d;//This is recommended
            int[][] e;//This also valid
            int[][] f;//This is also valid
            int[] g[];//This is also valid;
            int h[][];//this is also valid
            int[] i[];//This also valid
        }

        {
            /*
            Two Dimensional Array Declaration Important:
             */
            int [] a,b;//a=1-Dimensional ,b=1-Dimensional

            int[] c[],d;//c=2-Dimensional , d=1-Dimensional

            int[] e[] ,f[];// e=2-Dimensional Array ,f=2-Dimensional Array

            int []  []g,h;//g=2Dimensional Array h=2-Dimensional Array

            int []  []i,j[];//i=2-Dimensional Array ,j=3-Dimensional Array

//            int [] []k,[]l;//CTE

        }
        {
            /*
                Three Dimensional array declaration
             */
            int[][][]  a;
            int b[][][];
            int[][]  []c;
            int []  d[][];
            int []  []e[];
            int  [][]f[];
            int  []g[][];
            int  []h[][];
            int[][] i[];

        }


    }
}
