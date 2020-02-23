package jc01_2020.tsevan.lesson04;

/*
 *
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму и вывести в консоль его индекс.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][3];
        int max = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j][i] = scanner.nextInt();
                if (i > 0) {
                    array[j][i] += array[j][i];
                    max = array[j][i] > array[max][i] ? j : max;
                }
            }
        }
        System.out.println("Максимальную сумму содержит столбец под индексом: " + max);
    }
}

