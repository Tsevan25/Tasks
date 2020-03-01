package jc01_2020.tsevan.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являть наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

	public static void main(String[] args) {
		Box box = new Box(20000);

		Shape cylinder = new Cylinder(12, 22);
		Shape parallelepiped = new Parallelepiped(3, 4, 5);
		Shape pyramid = new Pyramid(20, 5);
		Shape sphere = new Sphere(7);

		System.out.println(box.add(cylinder));
		System.out.println(box.add(parallelepiped));
		System.out.println(box.add(pyramid));
		System.out.println(box.add(sphere));

	}

}
