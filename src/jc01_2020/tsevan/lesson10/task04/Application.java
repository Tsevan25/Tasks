package jc01_2020.tsevan.lesson10.task04;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */

import java.util.*;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			String surname = scanner.nextLine();
			String firstName = scanner.nextLine();
		}
		HashMap<String, String> map = new HashMap<>();
		map.put("Johnson", "John");
		map.put("Davis", "John");
		map.put("Tyler", "Mary");
		map.put("Smith", "Samantha");
		map.put("Mason", "Tom");
		map.put("Carlson", "Tom");
		map.put("Jones", "Tom");
		map.put("Evans", "Jay");
		map.put("Williams", "Jay");
		map.put("Baggins", "Frodo");

		System.out.println("Список всех имён:");
		Set<Map.Entry<String,String>> set=map.entrySet();
		for(Map.Entry<String,String> temp:set){
			System.out.println(temp.getKey()+" "+temp.getValue());
		}

		HashSet<String> names = new HashSet<>();
		Iterator<String> iterator = map.values().iterator();
		ArrayList<String> namesDelete=new ArrayList<>();
		while (iterator.hasNext()){
			String string;
			if (!names.add(string=iterator.next())) {
				namesDelete.add(string);
				iterator.remove();
			}
		}
		for (String num : namesDelete){
			iterator = map.values().iterator();
			while (iterator.hasNext()){
				if (iterator.next().equals(num)){
					iterator.remove();
				}
			}
		}
		System.out.println("\nСписок отфильтрованный:");
		for(Map.Entry<String,String> temp:set){
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
	}
}