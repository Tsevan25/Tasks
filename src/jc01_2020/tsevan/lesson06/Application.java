package jc01_2020.tsevan.lesson06;

public class Application {
    public static void main(String[] args) {
        Time time = new Time((byte) 20, (byte) 1, (byte) 2);
        Time newTime = new Time((byte) 1, (byte) 1, (byte) 1);
        System.out.println(time.getFullSeconds());
        System.out.println(newTime.getFullSeconds());
    }
}

