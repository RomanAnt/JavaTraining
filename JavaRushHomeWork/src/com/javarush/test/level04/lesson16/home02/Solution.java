package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите число : ");
        //String name = bufreader.readLine();

        //System.out.println("Введите год : ");
        //String xx1 = bufreader.readLine();
        int x1 = Integer.parseInt(bufreader.readLine());
        int x2 = Integer.parseInt(bufreader.readLine());
        int x3 = Integer.parseInt(bufreader.readLine());


        if(x1 < x2 && x1 > x3) System.out.println(x1);
        if(x2 < x3 && x2 > x1) System.out.println(x2);
        if(x3 < x2 && x3 > x1) System.out.println(x3);
        if(x2 < x1 && x2 > x3) System.out.println(x2);
        if(x3 < x1 && x3 > x2) System.out.println(x3);
        if(x1 < x3 && x1 > x2) System.out.println(x1);

    }
}
