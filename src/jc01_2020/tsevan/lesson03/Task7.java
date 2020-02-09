package jc01_2020.tsevan.lesson03;

/*
 *
 * Нарисовать диагонали квадрата с заданной длиной стороны
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину сторон диагоналей квадрата:");
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length) {
                    System.out.print("*   ");
                }

                if (i > 1 && j == 1 && i < length) {
                    System.out.print("*   ");
                }

                if (i > 1 && j == length && i < length) {
                    System.out.print("*   ");
                }

                if (i > 1 && j > 1 && j < length && i < length) {
                    System.out.print("    ");
                }

            }
            System.out.println("");
        }}}