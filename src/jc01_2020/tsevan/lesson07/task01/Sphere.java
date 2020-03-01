package jc01_2020.tsevan.lesson07.task01;

public class Sphere extends Shape {

	private double radius;
	public Sphere(final double radius) {
		this.radius = radius;
		setVolume(calculateVolume());
	}

	public double calculateVolume() {
		return (4 * Math.PI * Math.pow(radius, 3)) / 3;
	}
}
