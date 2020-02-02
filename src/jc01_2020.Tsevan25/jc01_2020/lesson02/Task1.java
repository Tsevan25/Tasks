package jc01_2020.Tsevan25.jc01_2020.lesson02;

/*
 *
 * Какое из чисел 1, 2 или 3 введено
 * С клавиатуры вводится число. Вывести на экран какое число введено в соответствии с форматом вывода
 *
 * Формат вывода (ошибки недопустимы):
 * "Число 1"
 * "Число 2"
 * "Число 3"
 * "Другое число"
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int numeric = scanner.nextInt();
		if (numeric < 4){
			System.out.println("Число "+numeric);
		} else {
			System.out.println("Другое число");
		}
		int numeric2 = scanner.nextInt();
		if (numeric2 < 4){
			System.out.println("Число "+numeric2);
		} else {
			System.out.println("Другое число");
		}
		int numeric3 = scanner.nextInt();
		if (numeric3 < 4){
			System.out.println("Число "+numeric3);
		} else {
			System.out.println("Другое число");
		}

	}
}
