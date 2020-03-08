package jc01_2020.tsevan.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Application {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        HashSet<Integer> map = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            // Заполнить список
            map.add(random.nextInt(100));
        }
        System.out.println(map); // Вывод случайных чисел от 0 до 100.
        Iterator<Integer> itr = map.iterator();
        while (itr.hasNext()) {
            int sum = itr.next();
            if (sum > 50) {
                itr.remove();
            }
        }
        System.out.println(map); // Вывод чисел, которые меньше 50.
    }

}
