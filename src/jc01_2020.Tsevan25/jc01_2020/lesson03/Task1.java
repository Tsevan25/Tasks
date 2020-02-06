package jc01_2020.Tsevan25.jc01_2020.lesson03;

/*
 *
 * С клавиатуры вводится целое число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите натуральное число");
		long input = scanner.nextLong();
		long maxNumber, minNumber;
		maxNumber = minNumber = (byte)(input % 10);
		while (input > 0) {
			long x = (byte)(input % 10);
			if (x > maxNumber)
				maxNumber = x;
			if (x < minNumber)
				minNumber = x;
			input /= 10;
		}
		System.out.println(maxNumber);


	}
}
