package jc01_2020.tsevan.lesson03;

/*
 *
 * Вывести на экран таблицу умножения (от 1 до 9)
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

public class Task8 {
	public static void main(String[] args) {
		int a, b;
		System.out.printf(" * |");
		for(a=1; a<10; a++)
			System.out.printf("%2d ", a);
		System.out.printf("\n---|------------");
		System.out.printf("----------------\n");
		for(a=1; a<10; a++)
		{
			System.out.printf("%2d |", a);
			for(b=1; b<10; b++)
				System.out.printf("%2d ", a*b);
			System.out.printf("\n");
		}

	}}
