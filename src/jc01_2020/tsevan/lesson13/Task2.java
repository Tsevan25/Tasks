package jc01_2020.tsevan.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

import static java.time.ZoneId.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now());
        ArrayList<String> list = new ArrayList<>(getAvailableZoneIds());
        IntStream.range(0, 10)
                .mapToObj(i -> ZonedDateTime.of(LocalDate.now(), LocalTime.now(), of(list.get(new Random().nextInt(list.size())))))
                .forEach(System.out::println);
    }
}
