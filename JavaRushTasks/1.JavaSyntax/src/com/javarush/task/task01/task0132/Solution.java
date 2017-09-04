package com.javarush.task.task01.task0132;

/* 
Реализуй метод sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15


Требования:
1. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
2. Метод sumDigitsInNumber должен возвращать значение типа int.
3. Метод sumDigitsInNumber не должен ничего выводить на экран.
4. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int h, d, ed;
        h = number / 100;
        d = (number - h*100) / 10;
        ed = ((number - h*100) - d*10);
        return h+d+ed;
    }
}