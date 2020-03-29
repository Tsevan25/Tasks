package jc01_2020.tsevan.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("src/jc01_2020/tsevan/lesson14/task01/lesson14-01.txt");
		FileInputStream fileInputStream = new FileInputStream("src/jc01_2020/tsevan/lesson14/task01/lesson14-01.txt");
		int i;
		while ((i = fileInputStream.read()) != -1) {
			System.out.print((char) i);
		}
		fileInputStream.close();
		//noinspection EqualsBetweenInconvertibleTypes
		if (fileInputStream.equals(fileWriter)) {
			System.out.println("Не совпадают");
		} else {
			System.out.println("Совпадают");
		}
	}
}


