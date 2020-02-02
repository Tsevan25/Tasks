package jc01_2020.Tsevan25.jc01_2020.lesson02;

/*
*
* Вводятся два целых числа. Проверить делится ли первое на второе.
* Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае)
*
* Формат вывода (ошибки недопустимы):
* "Делится. Частное = Х"
* "Не делится. Частное = Х. Остаток = Y"
* "Недопустимая операция"
*
*/

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое число");
        long first = scanner.nextLong();
        System.out.println("Введите делитель");
        long second = scanner.nextLong();
        long a = first / second;
        long b = first % second;
        float c = first % second;


        if (first % second == 0) {
            System.out.println("Делится. Частное = " + a);
        } else if (second % first != 0) {
            System.out.println("Не делится. Частное = " + a + ". Остаток = " + b);
        } else {
            System.out.println("Недопустимая операция");
        }
        
    }
}
