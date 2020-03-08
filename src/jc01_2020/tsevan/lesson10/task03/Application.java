package jc01_2020.tsevan.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sum = str.replaceAll(" ", "");
        char[] arr = sum.toCharArray();
        TreeSet<String> symbol = new TreeSet<>();
        for (char num : arr) {
            symbol.add(String.valueOf(num).toLowerCase());
            if (symbol.size() > 5) {
                symbol.remove(symbol.last());
            }
        }
        System.out.println(symbol);
    }
}