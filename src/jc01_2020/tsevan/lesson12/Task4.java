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

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Car> garage = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            garage.add(new Car(Color.values()[random.nextInt(5)]));
        }
        String string = garage.stream()
                .peek(car -> car.setColored(car.getColor().getColor()))
        .limit(10)
        .filter(car -> car.getColor()==Color.values()[Color.values().length-1])
        .peek(car -> System.out.println(car.getColor()))
        .map(Car::getColored)
        .collect(Collectors.joining(" "));
        System.out.println(string);

    }
}

class Car {
    private String colored;
    private Color color;

    public Car(Color color) {
        this.color = color;

    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getColored() {
        return colored;
    }

    public void setColored(String colored) {
        this.colored = colored;
    }
}
enum Color {
    BLACK("Black"),
    YELLOW("Yellow"),
    WHITE("White"),
    RED("Red"),
    PINK("Pink");

   private String color;
   Color (String color) {
       this.color = color;
   }
    public String getColor(){
        return color;
    }
}