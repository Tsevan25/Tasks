package jc01_2020.tsevan.lesson16;

import java.util.Arrays;

public enum CheckGame {
    WINNER_1("X"),
    WINNER_2("0"),
    DRAW("");

    private String figure;

    CheckGame(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public static CheckGame result(String figure) {
        return Arrays.stream(CheckGame.values())
                .filter(result -> {
                    return result.figure.equals(figure);
                })
                .findAny()
                .get();
    }
}
//