package jc01_2020.tsevan.lesson09.task06;

/*
 *
 * Создать и заполнить любыми числами два списка: обычный и связанный. Размер списков - 1 млн элементов.
 * В каждый список добавить 100_000 раз в нулевую позицию значение 0. Вывести в консоль длительности вставки 100_000
 * элементов для обычного и связанного списков.
 *
 * N.B. Поищите сами как засечь время.
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {
        // Объявить список
        ArrayList<Double> list1 = new ArrayList<>();
        LinkedList<Double> list2 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            // Заполнить список
            list1.add(Math.random());
            list2.add(Math.random());
        }
        long time = System.currentTimeMillis();
        {
            int i = 0;
            while (i < 100_000) {
                list1.add(0, 0d);
                i++;
            }
        }
        long time2 = System.currentTimeMillis();
        long result = time2 - time;
        System.out.println("Arraylist: " + result);

        time = System.currentTimeMillis();
        int i = 0;
        while (i < 100_000) {
            list2.addFirst(0d);
            i++;
        }
        time2 = System.currentTimeMillis();
        long result2 = time2 - time;
        System.out.print("Linkedlist: " + result2);
    }

}
