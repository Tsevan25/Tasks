package jc01_2020.tsevan.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Integer numeric = scanner.nextInt();
            // Заполнить список
			if (numeric%2==0 && numeric!=0) {
				list.add(numeric);
			}
		}
		for (Integer integer : list) {
			sum += integer;
		}
		System.out.println(sum/list.size());
	}

}