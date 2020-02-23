package jc01_2020.tsevan.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "");

        StringBuilder string = new StringBuilder(str);
        for (int i = 0; i < string.length(); i++) {
            char SymbolOne = string.charAt(i);
            for (int j = string.length() - 1; j > i; j--) {
                char SymbolTwo = string.charAt(j);
                if (SymbolOne == SymbolTwo) {
                    string.deleteCharAt(j);
                }
            }
        }
        System.out.println(string);
    }
}
