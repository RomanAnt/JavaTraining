package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        String b = "";
        Scanner inp = new Scanner(System.in);
//        System.out.println("Input a number");
        a = inp.nextInt();
        b = String.valueOf(a*a);

        System.out.println( b );
        //напишите тут ваш код
    }
}