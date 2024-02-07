package com.exceptionhandling.userdefined;

public class TooYoungException extends RuntimeException
{

    public  TooYoungException()
    {

    }
    public TooYoungException(String msg)
    {
        super(msg);
    }
}
