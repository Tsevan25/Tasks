package jc01_2020.tsevan.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean changeling = true;
        String NoSpaceText = str.replaceAll(" ", "").toLowerCase();
        int share = NoSpaceText.length() / 2;
        for (int i = 0; i < share; i++) {
            if (NoSpaceText.charAt(i) != NoSpaceText.charAt(NoSpaceText.length() - i - 1)) {
                changeling = false;
                break;
            }
        }
        if (changeling) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        System.out.println(NoSpaceText);
    }
}

