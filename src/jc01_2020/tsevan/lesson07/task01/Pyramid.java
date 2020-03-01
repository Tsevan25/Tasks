package jc01_2020.tsevan.lesson07.task01;

public class Pyramid extends Shape {

	private double side;
	private double height;
	public Pyramid( double side, double height) {
		this.side = side;
		this.height = height;
		setVolume(calculateVolume());
	}

	public double calculateVolume() {
		return Math.pow(side, 2) * (height / 3);
	}

}
