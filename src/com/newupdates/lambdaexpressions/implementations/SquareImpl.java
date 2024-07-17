package com.newupdates.lambdaexpressions.implementations;

import com.newupdates.lambdaexpressions.interfaces.InterfSquare;

public class SquareImpl implements InterfSquare
{
    @Override
    public int square(int x)
    {
        return x*x;
    }
}
