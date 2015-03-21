package com.javatraining.unit4hw.attorneys;

public class Attorney
{

    private String _name;
    private double _power;

    public Attorney(String name)
    {
        _name = name;
        _power = Math.random();
    }

    public String getName()
    {
        return _name;
    }

    public double getPower()
    {
        return _power;
    }


}
