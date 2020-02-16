package jc01_2020.tsevan.lesson02;

import java.util.Scanner;

/*
 *
 * Среди трех чисел найти среднее по величине
 * Вывести на экран среднее значение. В комбинации чисел "-8, 10, 10" среднее по величине число - 10.
 * Учитывайте возможность ввода отрицательных чисел
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int sum = first;
        if (first <= second && third >= second || third <= second && first >= second)
            sum = second;
        else if (first <= third && second >= third || second <= third && first >= third)
            sum = third;
        System.out.println(sum);
    }
}
