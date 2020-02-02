package jc01_2020.Tsevan25.jc01_2020.lesson02;

/*
*
* Делится ли введенное число на 3 без остатка
* С клавиатуры вводится число. Вывести на экран делится ли оно на 3 без остатка
*
* Формат вывода (ошибки недопустимы):
* "Делится"
* "Не делится"
*
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        long numeric = scanner.nextLong();
        if (numeric % 3 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }

        long numeric2 = scanner.nextLong();
        if (numeric2 % 3 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }

        long numeric3 = scanner.nextLong();
        if (numeric3 % 3 == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }


    }
}
