package jc01_2020.tsevan.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {
    public static void main(String[] args) {
        Cat catNamedTom = new Cat("Том", 4);
        Cat catNamedJerry = new Cat("Джерри", 2);

        ComparingTheLivesOfCats lives = (catNamedTom1, catNamedJerry2) -> {
            if (catNamedTom1.numberOfLives > catNamedJerry2.numberOfLives) {
                return catNamedTom1;
            } else {
                return catNamedJerry2;
            }
        };
        System.out.println("Больше всего жизней у кота по имени: " + lives
                .compareTheLivesOfCats(catNamedTom, catNamedJerry)
                .name);
    }
}

class Cat {
    String name;
    int numberOfLives;

    public Cat(String name, int numberOfLives) {
        this.name = name;
        this.numberOfLives = numberOfLives;
    }
}

interface ComparingTheLivesOfCats {
    Cat compareTheLivesOfCats(Cat catNamedTom, Cat catNamedJerry);
}