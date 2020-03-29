package jc01_2020.tsevan.lesson14.task03;

/*
 *
 * Создать объект любого пользовательского класса минимум с тремя полями с ненулевыми значениями.
 * Объявить любое поле несериализуемым.
 * Сериализовать этот объект в файл lesson14/resource/<userClassName>.dat.
 *
 */

import jc01_2020.tsevan.lesson14.examples.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {

	public static void main(String[] args) {
		File file = new File("src/jc01_2020/tsevan/lesson14/resource/");
		try (ObjectOutputStream file1 = new ObjectOutputStream(new FileOutputStream(file +"Dog.dat"))) {
			Dog dog = new Dog("Bobik", 3, "Black", "Rottweiler");
			file1.writeObject(dog);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

