package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        int inputNumber = 0;


        while (inputNumber != 1000) {
            Scanner in = new Scanner(System.in);


                if (!in.hasNextInt()) {
                    System.out.print("Введите число!");

                }
                else {
                    inputNumber = in.nextInt();
                    inputNumber = checkInputNumber(inputNumber);
                    System.out.println("inputNumber = " + inputNumber);

                }


            }


    }

    public static int checkInputNumber(int inputNumber) {
        if (inputNumber == 0) {
            System.out.println(inputNumber);
        } else {
            if (inputNumber > 0) {
                System.out.println(inputNumber * 2);
            } else {
                System.out.println(++inputNumber);
            }

        }
        return inputNumber;
    }
}