package jc01_2020.tsevan.lesson13;

/*
 *
 * Создать приложение-напоминалку о количестве дней до дней рождения. Использовать карту. Ключ - имя человека,
 * значение - дата рождения (в прошлом, LocalDate). Реализовать метод по добавлению записи в карту (входные параметры имя и дата
 * строкой в формате "дд/мм/гггг"). Реализовать метод, который выведет в консоль имена и оставшиеся дни до
 * ближайшего дня рождения всех ("имя - осталось дней", каждое с новой строки). Отдельно реализовать метод, который
 * вернет кол-во дней для одного конкретного человека (входной параметр - имя)
 *
 */


import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
		Map<String, LocalDate> map = new HashMap<>();
		map.put("Александр", LocalDate.of(1990, 4, 10));
		map.put("Михаил", LocalDate.of(1980, 5, 20));
		map.put("Екатерина", LocalDate.of(2000, 6, 30));
		map.put("Лилия", LocalDate.of(2010, 7, 1));
		System.out.println(map);
    
		}
}
