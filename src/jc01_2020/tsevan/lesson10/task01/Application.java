package jc01_2020.tsevan.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Four");
        stringSet.add("Three");
        stringSet.add("Two");
        stringSet.add("One");
        System.out.println("Размер множества: " + stringSet.size());
        stringSet.add("One");
        System.out.println("Размер множества: " + stringSet.size());
    }
}
