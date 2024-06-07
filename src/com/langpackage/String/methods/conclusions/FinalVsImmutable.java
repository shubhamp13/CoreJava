package com.langpackage.String.methods.conclusions;

public class FinalVsImmutable
{
    public static void main(String[] args)
    {
        final StringBuffer sb = new StringBuffer("Shubham");
        sb.append(" Puri");
        System.out.println(sb);
//        sb=new StringBuffer("SHubham Puri"); We Can not reinitialize final variable
    }
}
