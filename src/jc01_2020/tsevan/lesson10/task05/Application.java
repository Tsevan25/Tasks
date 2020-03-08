package jc01_2020.tsevan.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */

import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.*;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        TreeMap<String, List<String>> map = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            // Заполнить список
            String nameBuyer = scanner.nextLine();
            String product = scanner.nextLine();
            String amount = scanner.nextLine();
            map.put(nameBuyer,
                    new ArrayList<>(asList(nameBuyer, product)));
			map.forEach((key, value) -> {
				System.out.println(key + ":");
				System.out.println(value.get(0) + " - " + value.get(1));
			});
		}

    }

}
