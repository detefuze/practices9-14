package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice10;

public class Student {
    private final String name;
    private final int age;
    private final int points;

    public Student(String name, int age, int points) {
        this.name = name;
        this.age = age;
        this.points = points;
    }

    public int getPoints(){
        return points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + points +
                '}';
    }
}
