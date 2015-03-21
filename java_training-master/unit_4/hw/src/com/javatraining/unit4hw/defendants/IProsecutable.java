package com.javatraining.unit4hw.defendants;

import com.javatraining.unit4hw.attorneys.Attorney;

public interface IProsecutable
{
    String getName();

    boolean prosecute(Attorney prosecutor, Attorney defenseCounsel);
}