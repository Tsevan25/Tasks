package jc01_2020.tsevan.lesson16;

/*
*
* Написать игру крестики нолики, где два игрока-потока играют друг с другом
* Ходят по очереди.
* Вывести в консоль результат партии и итоговое игровое поле
*
*/

import jc01_2020.lesson16.CheckGame;

import javax.xml.transform.Result;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Table table = new Table();

        Player player1 = new Player(table, "X");
        Player player2 = new Player(table, "0");

        player1.start();
        player2.start();
        player1.join();
        player2.join();

        System.out.println("Победитель: " + table.getCheckGame().getFigure());

    }
}

