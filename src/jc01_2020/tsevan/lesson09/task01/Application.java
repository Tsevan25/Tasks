package jc01_2020.tsevan.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Объявить список
		ArrayList<String> list = new ArrayList<String>();
		list.add("Variable");
		list.add("Massive");
		list.add("Cycles");
		list.add("Collections");
		list.add("Strings");
		int largeString = list.get(0).length();
		int index = 0;

		for (int i = 0; i < 5; i++) {
			String str = scanner.nextLine();
			// Заполнить список
			if (list.get(i).length() > largeString) {
				largeString = list.get(i).length();
				index = i;
			}
		}
		System.out.println(list.get(index));
	}
}
