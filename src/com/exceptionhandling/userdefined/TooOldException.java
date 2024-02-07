package com.exceptionhandling.userdefined;

public class TooOldException extends RuntimeException
{
    String msg="Invalid Age";
    public TooOldException()
    {

    }
    public TooOldException(String msg)
    {
        this.msg=msg;
    }

    @Override
    public String toString()
    {
        return msg;
    }
}
