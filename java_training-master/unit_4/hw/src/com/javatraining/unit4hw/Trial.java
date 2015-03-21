package com.javatraining.unit4hw;

import java.util.Random;

import com.javatraining.unit4hw.attorneys.Attorney;
import com.javatraining.unit4hw.attorneys.DennyCrane;
import com.javatraining.unit4hw.attorneys.YuriChaika;
import com.javatraining.unit4hw.defendants.Fraudster;
import com.javatraining.unit4hw.defendants.Hitler;
import com.javatraining.unit4hw.defendants.IProsecutable;
import com.javatraining.unit4hw.defendants.SerialKiller;
import com.javatraining.unit4hw.defendants.Thief;

public class Trial
{
    private static IProsecutable defendants[];
    private static Attorney prosecutors[];
    private static Attorney defenseCounsels[];


    public static void main(String[] args)
    {
        //defendants
        defendants      = new IProsecutable[5];
        defendants[0]   = new Hitler();
        defendants[1]   = new SerialKiller("Jack the Ripper");
        defendants[2]   = new SerialKiller("Hannibal Lecter");
        defendants[3]   = new Thief("John Smith");
        defendants[4]   = new Fraudster("Sergey Mavrodi");

        //defense counsels
        defenseCounsels     = new Attorney[3];
        defenseCounsels[0]  = new Attorney("Mike Ross");
        defenseCounsels[1]  = new DennyCrane();
        defenseCounsels[2]  = new Attorney("Anatoly Kucherena");

        //prosecutors
        prosecutors     = new Attorney[3];
        prosecutors[0]  = new Attorney("Vasya Pupkin");
        prosecutors[1]  = new Attorney("Serge Sargossyan");
        prosecutors[2]  = new YuriChaika();

        System.out.println("All Rise! Court is in session. The Honorable Judge JVM presiding.");

        Attorney defenseCounsel;
        Attorney prosecutor;
        for (IProsecutable defendant: defendants)
        {
            defenseCounsel  = getDefenseCounsel();
            prosecutor      = getProsecutor();

            System.out.println("-----------------------");
            System.out.println("State Massachusetts against " + defendant.getName() + ".");
            System.out.println("The prosecutor " + prosecutor.getName() + " has the word - " + prosecutor.getPower());
            System.out.println("The defense counsel " + defenseCounsel.getName() + " has the word - " + defenseCounsel.getPower());
            System.out.println(defendant.prosecute(prosecutor, defenseCounsel) ? "GUILTY!" : "NOT GUILTY!");
        }
    }


    private static Attorney getDefenseCounsel()
    {
        int index = new Random().nextInt(defenseCounsels.length);
        return defenseCounsels[index];
    }


    private static Attorney getProsecutor()
    {
        int index = new Random().nextInt(prosecutors.length);
        return prosecutors[index];
    }

}
