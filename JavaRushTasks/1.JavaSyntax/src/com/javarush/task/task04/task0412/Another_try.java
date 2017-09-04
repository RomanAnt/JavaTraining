package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * Created by rr on 01.09.17.
 */
public class Another_try {
    public static void main(String[] argums) throws IOException {

        BufferedReader bufRdr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader (bufRdr);
        int inp = 0;
        while (inp != 1000) {
            try {
                System.out.print("Введите число, 1000 - выход : ");;
                inp = Integer.parseInt (input.readLine());


                if (inp !=1000 ) Solution.checkInputNumber(inp);

            } catch (NumberFormatException e) {
                System.out.println("Нужно вводить число!");;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("\nПрограмма завершена.");
        }
    }

}
