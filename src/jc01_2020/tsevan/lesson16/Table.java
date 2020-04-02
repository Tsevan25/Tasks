package jc01_2020.tsevan.lesson16;

public class Table {
    private CheckGame checkGame = null;
    private String[][] field;

    public Table() {
        this.field = new String[][]{
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}};
    }

    public CheckGame getCheckGame() {
        return checkGame;
    }

    public void setCheckGame(CheckGame checkGame) {
        this.checkGame = checkGame;
    }

    public void printField() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            sb.append(field[2][j]);
            if (j != 2) {
                sb.append("|");
            }
        }
        sb.append("\n");
        sb.append("—————");
        sb.append("\n");
        for (int j = 0; j < 3; j++) {
            sb.append(field[1][j]);
            if (j != 2) {
                sb.append("|");
            }
        }
        sb.append("\n");
        sb.append("—————");
        sb.append("\n");
        for (int j = 0; j < 3; j++) {
            sb.append(field[2][j]);
            if (j != 2) {
                sb.append("|");
            }
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }

    public boolean gameEnding() {
        return checkGame != null;
    }

    public boolean movePossible() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void randomStep(String figure) {
        motion(figure);
        checkResult(figure);
    }

    private void motion(String figure) {
        int row = -1;
        int column = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(" ")) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        field[row][column] = figure;
    }

    private void checkResult(String figure) {
        for (int i = 0; i < 3; i++) {
            checkRows(i, figure);
            checkColumns(i, figure);
        }
        diagonals(figure);
    }

    private void checkRows(int row, String figure) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (field[row][i].equals(figure)) {
                counter++;
            }
        }
        if (counter == 3) {
            setCheckGame(CheckGame.result(figure));
        }
    }

    private void checkColumns(int column, String figure) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][column].equals(figure)) {
                counter++;
            }
        }
        if (counter == 3) {
            setCheckGame(CheckGame.result(figure));
        }
    }

    private void diagonals(String figure) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals(figure)) {
                count1++;
            }
            if (field[i][2 - i].equals(figure)) {
                count2++;
            }
        }
//
        if (count1 == 3) {
            setCheckGame(CheckGame.result(figure));
            System.out.println("Итоговое игровое поле: \n");
        } else if (count2 == 3) {
            setCheckGame(CheckGame.result(figure));
        }
    }

}