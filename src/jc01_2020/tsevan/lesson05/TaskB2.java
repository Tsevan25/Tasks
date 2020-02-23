package jc01_2020.tsevan.lesson05;

/*
 *
 * Проверить, что введенная фамилия является двойной, т.е. пишется через дефис. Фамилия может быть написана как
 * кириллицей, так и латиницей, но НЕ одновременно с помощью двух алфавитов. Остальные требования к фамилиям адекватные
 * (только буквы)
 *
 * Вывести в консоль логический результат проверки (boolean)
 *
 */

import java.util.Scanner;

public class TaskB2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		boolean result = false;
		String regexp = "^([A-Za-z]+[\\-]+[A-Za-z]+$|^[А-Яа-я]+[\\-]+[А-Яа-я]+$)";
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(str);
		result = matcher.find();
		System.out.println(result);
	}
}
