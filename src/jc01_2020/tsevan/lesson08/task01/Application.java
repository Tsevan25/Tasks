package jc01_2020.tsevan.lesson08.task01;

/*
 *
 * Написать программу, которая получает на вход латинскую букву в любом регистре и выводит в консоль номер этой буквы
 * в алфавите. Использовать enum
 *
 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        int result = Letters.valueOf(letter.toUpperCase()).ordinal() + 1;
        System.out.println("Порядковый номер данной буквы в алфавите: " + result);

    }
}

enum Letters {
    A, B, C, D, E, F, G, H, I, J, K, L, M,
    N, O, P, Q, R, S, T, U, V, W, X, Y, Z
}