package com.javarush.task.task02.task0201;

/* 
Реализуй метод print. Метод должен вывести на экран переданную строку 4 раза. Каждый раз с новой строки.


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод print должен выводить текст на экран.
4. Метод main должен вызвать метод print класса Solution только один раз.
5. Метод print должен выводить на экран строку 4 раза. Каждый раз с новой строки.
*/


public class Solution {
    public static void main(String[] args) {

        print("Java easy to learn!");
    }

    public static void print(String s) {

            System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }
}
