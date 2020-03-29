package jc01_2020.tsevan.lesson14.task04;

/*
 *
 * Десериализовать объект из предыдущей задачи. Вывести в консоль значения всех полей
 *
 */

import jc01_2020.tsevan.lesson14.examples.Person;
import jc01_2020.tsevan.lesson14.task03.Dog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Application {

	public static void main(String[] args) {
		try (ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("src/jc01_2020/tsevan/lesson14/resourceDog.dat"))) {
			Dog dog = (Dog) file1.readObject();
			System.out.println(dog.toString());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
