package jc01_2020.tsevan.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            // Заполнить список
            list.add(str);
            list.addFirst(list.getLast());
            list.removeLast();
            System.out.println(list);

        }
    }

}
