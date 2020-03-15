package jc01_2020.tsevan.lesson13;

/*
 *
 * Сгенерировать случайную дату в интервале с 1 по 4 марта 2020 (включительно). Вывести в консоль каждую дату и
 * результат сравнения этих дат (дата1 больше/меньше/равна дата2)
 *
 */

import java.time.LocalDate;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        LocalDate dateOne = LocalDate
				.of(2020,
						3,
						random.nextInt(4) + 1);
        LocalDate dateSecond = LocalDate
				.of(2020,
						3,
						random.nextInt(4) + 1);
        if (dateOne.isAfter(dateSecond)) {
            System.out.println(dateOne + " больше " + dateSecond);
        } else if (dateOne.isBefore(dateSecond)) {
            System.out.println(dateOne + " меньше " + dateSecond);
        } else {
            System.out.println(dateOne + " равна " + dateSecond);
        }
    }
}
