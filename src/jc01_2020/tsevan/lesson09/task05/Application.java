package jc01_2020.tsevan.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Нажмите Enter");
        // Объявить список
        ArrayList<Integer> listNum1 = new ArrayList<>();
        ArrayList<Integer> listNum2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            // Заполнить список
            listNum1.add(0);
            listNum2.add(0);
            listNum1.add(-1);
            listNum2.add(-1);
            listNum1.add(1);
            listNum2.add(1);
            listNum1.add(-2);
            listNum2.add(-2);
            listNum1.add(2);
            listNum2.add(2);
            listNum1.add(3);
            listNum2.add(-3);

            listNum1.removeIf(s -> s < 0);
            System.out.println("Список 1: " + listNum1);

            listNum2.removeIf(s -> s > 0);
            System.out.println("Список 2: " + listNum2);

            ArrayList<Integer> listNum3 = new ArrayList<>();
            listNum3.addAll(listNum1);
            listNum3.addAll(listNum2);
            System.out.println("Список 3: " + listNum3);
            listNum3.removeIf(s -> s == 0);
            System.out.println("Итоговый список: " + listNum3);
        }
    }
}


