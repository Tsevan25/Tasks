package jc01_2020.tsevan.test02;

/*
 *
 * 1) Десериализовать из файла secret.dat объект одной из реализаций интерфейса Employee.
 * 2) Установить значение поля Department в соответствии с реальной профессией (реализовать в классе Department
 * статический метод, который вернет значение перечисления).
 * 3) Установить endDate сегодняшним числом.
 * 4) Установить в поле workPeriod общее время работы в днях ( [startDate, endDate) )
 * 5) В стриме для каждой награды изменить ее имя в соответствии с шаблоном: "дата - имя". Дата в формате дд-мм-гггг
 * 6) В том же стриме отсортировать все награды в прямом хронологическом порядке. Сохранить их в объект
 * 7) Реализовать в интерфейсе Employee метод по умолчанию print(), чтобы вывести значения всех полей (в том числе
 * коллекций) в любом удобно читаемом виде
 * 8) Сохранить в файл resource/result.txt результат выполнения метода employee.print()
 *
 * Работать только через интерфейс Employee
 *
 * Обработать возможные ошибки таким образом, чтобы в консоль записывался текст ошибки и после этого был выброшен
 * RuntimeException.
 *
 */

import jc01_2020.test02.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

import static jc01_2020.test02.Main.getEmployee;

public class Main  extends  Thread {


    // Изменить на реальный путь после копирования файлов
    public static final String PATH_FROM = "src/jc01_2020/tsevan/test02/resource/secret.dat";
    public static final String PATH_TO = "src/jc01_2020/tsevan/test02/resource/result.txt";


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = getEmployee();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/jc01_2020/tsevan/test02/resource/secret.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

             Helper helper = (Helper) objectInputStream.readObject();

            System.out.println(helper);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static Employee getEmployee() {
        return null;
    }
}
