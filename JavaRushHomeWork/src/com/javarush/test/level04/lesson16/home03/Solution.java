package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true)
        {//System.out.println("Введите год : ");
            String yy = bufreader.readLine();
            int y = Integer.parseInt(yy);
            sum += y;
            if (y == -1) break;
        }//Напишите тут ваш код

        System.out.println(sum);
    }

}
