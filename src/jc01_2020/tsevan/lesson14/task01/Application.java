package jc01_2020.tsevan.lesson14.task01;

/*
 *
 * При помощи FileWriter создать в папке lesson14/resource текстовый файл с именем lesson14-01.txt, записать в него строки
 * "Давай проверим, что мы умеем писать в файл.
 * Поехали!"
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("src/jc01_2020/tsevan/lesson14/task01/lesson14-01.txt");
        fileWriter.write("Давай проверим, что мы умеем писать в файл. \nПоехали!");
        fileWriter.close();
    }
}

