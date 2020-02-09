package jc01_2020.tsevan.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secret = (int) (Math.random() * 100 + 1);
		System.out.println("Выберите число от 1 до 100:");
		int scannerNumber = scanner.nextInt();
		if (scannerNumber > secret || scannerNumber < secret) {
			for (int calculator = 9; calculator > 0; --calculator) {
				if (scannerNumber > secret) {
					System.out.println("Вы выбрали число больше загаданного. Осталось попыток: " + calculator );
					Scanner newscannerT = new Scanner(System.in);
					int scannerttwo = newscannerT.nextInt();
					scannerNumber = scannerttwo;
				}
				else if (scannerNumber < secret) {
					System.out.println("Вы выбрали число меньше загаданного. Осталось попыток " + calculator);
					Scanner newscnnaerThr = new Scanner(System.in);
					int newScannerThree = newscnnaerThr.nextInt();
					scannerNumber = newScannerThree;
				}
			}
			if (scannerNumber == secret) {
				System.out.println("Вы победили! Число которое было загадано: "+secret + ".");
			}
		}
		if (scannerNumber > secret || scannerNumber < secret) {
			System.out.println("Вы потерпели поражение! Число которое было загадано: "+secret + ".");
		}

	}
}
