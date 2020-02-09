package jc01_2020.tsevan.lesson03;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		// Программа нормально работает если ввести одинаковую высоту и ширину!

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ширину");
		int horizontal = scanner.nextInt();
		System.out.println("Введите высоту");
		int vertical = scanner.nextInt();

		for (int i = 1; i <= horizontal; i++) {
			for (int j = 1; j <= horizontal; j++) {
				if (i == 1 || i == horizontal) {
					System.out.print("$ ");
				}

				if (i > 1 && j == 1 && i < vertical) {
					System.out.print("$ ");
				}

				if (i > 1 && j == horizontal && i < vertical) {
					System.out.print("$ ");
				}

				if (i > 1 && j > 1 && j < horizontal && i < vertical) {
					System.out.print("0 ");
				}

			}
			System.out.println("");
		}
		}}



