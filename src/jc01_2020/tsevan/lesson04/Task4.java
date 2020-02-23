package jc01_2020.tsevan.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        int min = 0;
        int max = 0;
        int sum = 0;
        int interim; //
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            max = array[i] > array[max] ? i : max;
            min = array[i] < array[min] ? i : min;
        }
        if (min < max) {
            interim = 1;
        } else {
            interim = -1;
        }
        for (int i = min + interim; max * interim > i * interim; i = interim + i) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
