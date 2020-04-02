package jc01_2020.tsevan.lesson16;

public class Player extends Thread {

    private final Table table;
    private String figure;
    private CheckGame DRAW;


    public Player(Table table, String figure) {
        this.table = table;
        this.figure = figure;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(figure);

        synchronized (table) {
            try {
                while (true) {
                    if (table.gameEnding()) {
                        break;
                    }
                    Thread.sleep(100);
                    table.notifyAll();
                    if (table.movePossible()) {
                        table.randomStep(figure);
                    } else {
                        table.setCheckGame(DRAW);
                    }
                    table.printField();
                    table.wait();
                }
                table.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//
}