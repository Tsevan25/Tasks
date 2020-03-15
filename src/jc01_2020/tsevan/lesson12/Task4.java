package jc01_2020.tsevan.lesson12;

/*
 *
 * Создать класс Car с полем enum Color (определите в нем хотя бы 5 цветов) и строковым полем, которое будет хранить
 * текстовое представление цвета. Конструктор принимает и инициализирует только поле-перечисление. Создаем 50 автомобилей
 * случайного цвета. В стриме:
 * 1) заполняем второе поле текущим значением цвета
 * 2) оставляем в стриме первые 10 автомобилей
 * 3) оставляем в стриме все автомобили, значение цвета которых равно цвету последнего элемента перечисления (не задавать
 * цвет в явном виде! я могу менять значения и количество элементов перечисления)
 * 4) вывести в консоль буленовское значение есть ли такой автомобиль
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Map<Car, String> car = new HashMap<>();
        Random random = new Random();


    }
}

class Car {

    enum Color {
        BLACK, YELLOW, WHITE, RED, PINK
    }

    String color;

    public Car(String color) {
        this.color = color;
    }

}
