package com.javatraining.unit4hw.defendants;

import com.javatraining.unit4hw.attorneys.Attorney;

public class Thief extends Defendant implements IProsecutable
{

    public Thief(String name)
    {
        super(name);
    }

    @Override
    public boolean prosecute(Attorney prosecutor, Attorney defenseCounsel)
    {
        boolean guilty = prosecutor.getPower() > defenseCounsel.getPower();

        return guilty;
    }

}
