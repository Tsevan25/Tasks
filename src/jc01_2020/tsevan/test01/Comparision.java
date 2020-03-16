package jc01_2020.tsevan.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.Scanner;

public class Comparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSum = 0;
        int secondSum = 0;
        char[] split = input.toCharArray();
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = (int) split[i] - 48;
        }
        for (int i = 0; i < split.length; i++) {
            if ((i + 3) % 4 == 0 && array[i] < 5) {
                firstSum += array[i];
            }

        if (firstSum == secondSum) {
			System.out.println("равны");
		} else if (firstSum > secondSum) {
			System.out.println("firstsum "+ firstSum);
		} else {
        	secondSum += array[i];
		}}
    }
}