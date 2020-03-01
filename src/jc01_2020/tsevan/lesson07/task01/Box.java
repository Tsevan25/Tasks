package jc01_2020.tsevan.lesson07.task01;

public class Box extends Shape {
    private double volume;
    public Box(double volume) {
        setVolume(volume);
    }

    public boolean add(Shape shape) {
        double volume = getVolume() - shape.getVolume();
        if (volume >= 0) {
            setVolume(volume);
            System.out.println(volume);
            return true;
        } else {
            return false;
        }
    }
}
