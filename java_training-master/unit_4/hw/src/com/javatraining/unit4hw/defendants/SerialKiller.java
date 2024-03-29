package com.javatraining.unit4hw.defendants;

import com.javatraining.unit4hw.attorneys.Attorney;

public class SerialKiller extends Defendant implements IProsecutable
{

    public SerialKiller(String name)
    {
        super(name);
    }

    @Override
    public boolean prosecute(Attorney prosecutor, Attorney defenseCounsel)
    {
        boolean guilty = 2 * prosecutor.getPower() > defenseCounsel.getPower();

        return guilty;
    }

}
