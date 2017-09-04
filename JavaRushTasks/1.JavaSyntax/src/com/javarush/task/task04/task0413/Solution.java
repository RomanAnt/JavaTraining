package com.javarush.task.task04.task0413;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(bfr);
        int inp = 0;

    //    while (inp != 1000) { /*чтоб можно было несколько раз запросить, выход по вводу "1000"*/
            try {
                inp = Integer.parseInt(input.readLine());
                if (inp > 0 && inp < 8) {
                    switch (inp) {
                        case 1:
                            System.out.println("понедельник");
                            break;
                        case 2:
                            System.out.println("вторник");
                            break;
                        case 3:
                            System.out.println("среда");
                            break;
                        case 4:
                            System.out.println("четверг");
                            break;
                        case 5:
                            System.out.println("пятница");
                            break;
                        case 6:
                            System.out.println("суббота");
                            break;
                        case 7:
                            System.out.println("воскресенье");
                    }
                } else {
                    System.out.println("такого дня недели не существует");
                }

            } catch (NumberFormatException e) {
                System.out.println("Нужно вводить число!");

            }
//        }


    }
}