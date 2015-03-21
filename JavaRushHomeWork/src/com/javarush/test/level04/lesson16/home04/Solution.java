package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] argumss)   throws Exception
    {
        BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите число : ");
        String name = bufreader.readLine();

        //System.out.println("Введите год : ");
        String yy = bufreader.readLine();
        int y = Integer.parseInt(yy);

        //System.out.println("Введите месяц : ");
        String mm = bufreader.readLine();
        int m = Integer.parseInt(mm);

        //System.out.println("Введите дату : ");
        String dd = bufreader.readLine();
        int d = Integer.parseInt(dd);

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
