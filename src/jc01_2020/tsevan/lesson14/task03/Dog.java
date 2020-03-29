package jc01_2020.tsevan.lesson14.task03;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;
    private String color;
    private String breed;


    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

     String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

     String getColor() {
        return color;
    }

     String getBreed() {
        return breed;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                ", breed=" + breed +
                '}';
    }
}
