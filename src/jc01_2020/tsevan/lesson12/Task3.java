package jc01_2020.tsevan.lesson12;

/*
 *
 * Создать карту вида "фамилия"-"имя" из 20 элементов. Длина и фамилии, и имени от 5 до 10 символов
 * 1) Вывести в консоль все значения карты
 * 2) переписать все значения как имя + фамилия
 * 3) оставить в стриме все имена, которые не длиннее 16 символов
 * 4) Вывести в консоль самое длинное имя
 *
 */

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Овчинников", "Бенедикт");//1
		map.put("Троицкий", "Ярослав");//2
		map.put("Озеров", "Тимофей");//3
		map.put("Латышев", "Михаил");//4
		map.put("Островский", "Геннадий");//5
		map.put("Вишневский", "Юрий");//6
		map.put("Шульгин", "Вадим");//7
		map.put("Митрофанов", "Дмитрий");//8
		map.put("Пушкин", "Александр");//9
		map.put("Корчагин", "Борис");//10
		map.put("Колесников", "Владимир");//11
		map.put("Кондратьев", "Григорий");//12
		map.put("Тихомиров", "Борислав");//13
		map.put("Чумаков", "Филимон");//14
		map.put("Калашников", "Константин");//15
		map.put("Спиридонов", "Радомир");//16
		map.put("Овсянников", "Максим");//17
		map.put("Голованов", "Роман");//18
		map.put("Серебряков", "Николай");//19
		map.put("Яшин", "Станислав");//20
		// full the map

		System.out.println(map);
		map.replaceAll((String key, String value) -> {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(value);
			stringBuilder.append(key);
			return stringBuilder.toString();
		});

		HashMap<String, String> collect = new HashMap<>();
		for (Map.Entry<String, String> x : map.entrySet()) {
			if (16 > x.getValue().length()) {
				if (collect.put(x.getKey(), x.getValue()) != null) {
					throw new IllegalStateException("Duplicate key");
				}
			}
		}
		List<String> newMap = new ArrayList<>(collect.values());
		System.out.println(newMap);

		String longName = Collections.max(newMap, Comparator.comparingInt(String::length)); // use map here: longName = map...

		System.out.println("longName = " + longName);

	}
}
