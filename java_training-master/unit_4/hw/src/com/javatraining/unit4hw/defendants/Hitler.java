package com.javatraining.unit4hw.defendants;

import com.javatraining.unit4hw.attorneys.Attorney;

public class Hitler extends Defendant implements IProsecutable
{

    public Hitler()
    {
        super("Hitler");
    }

    @Override
    public boolean prosecute(Attorney prosecutor, Attorney defenseCounsel)
    {
        return true;
    }

}
