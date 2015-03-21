package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader redr = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String input;

        while (true)
        {   input = redr.readLine();
            if (input.equals("сумма")) break;
            else sum += Integer.parseInt(input);

        }
        //System.out.println("outside the while cycle");
        System.out.println(sum);
    }
}
