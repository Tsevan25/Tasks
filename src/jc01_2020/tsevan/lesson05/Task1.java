package jc01_2020.tsevan.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
        String reg = "^[a-zA-Z_]{1}[a-zA-Z0-9_]+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        if (Pattern.matches("^[a-zA-Z_]{1}[a-zA-Z0-9_]+", str)){
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
