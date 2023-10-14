package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice9;

public record Student<T>(T points) {

    @Override
    public String toString() {
        return "Student{" +
                "points=" + points +
                '}';
    }
}
