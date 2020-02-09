package jc01_2020.tsevan.lesson03;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите факториал числа n : ");
		int numeric = scanner.nextInt();
		int result = 1;
		for (int a = 2; a <= numeric; a++)
			result *= a;
		System.out.println(result);
		if (numeric == 0 || numeric == 1)
			System.out.println(result);
		if(numeric < 0)
			System.out.println("Вы ввели отрицательный факториал!");
		while (numeric < 0);{System.out.println("Факториал введенного числа: "+ result);}


	}
}
