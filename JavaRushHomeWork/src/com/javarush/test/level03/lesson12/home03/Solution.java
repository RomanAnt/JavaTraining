package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите число : ");
        String s = bufreader.readLine();
        int slry = Integer.parseInt(s);

        System.out.println("Я буду зарабатывать $" + slry + " в час");//Напишите тут ваш код
    }
}