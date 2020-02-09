package jc01_2020.tsevan.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		long input = scanner.nextLong();
		long mirror = 0;
		while (input != 0) {
			mirror = mirror * 10 + (input % 10);
			input = input / 10;
		}
		System.out.print(mirror);

	}}
