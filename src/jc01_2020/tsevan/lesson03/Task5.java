package jc01_2020.tsevan.lesson03;

/*
 *
 * Найти все совершенные числа до 10000. Совершенное число - это такое число, которое равно сумме всех своих делителей,
 * кроме себя самого.
 * Например, число 6 является совершенным, т.к. кроме себя самого делится на числа 1, 2 и 3, которые в сумме дают 6.
 *
 * Формат вывода (ошибки недопустимы):
 * каждое число в новой строке
 *
 */



public class Task5 {
	public static void main(String[] args) {
		System.out.println("Совершенные числа до 10000:");
		int x = 10_000;
		int a, b, с;
		for (a = 1; a<x; a++) {
			с = 0;
			for (b = 1; b<a; b++) {
				if (a%b == 0)
					с = с + b;
			}
			if (a == с)
				System.out.println(a);
		}
	}
}