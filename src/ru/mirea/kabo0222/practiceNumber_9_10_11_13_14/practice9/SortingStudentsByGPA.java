package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice9;

import java.util.*;

public class SortingStudentsByGPA{
    public static void SortingPoints(Integer[] points, int low, int high)
    {
        if (points.length == 0 || low >= high) return;


        int middle = low + (high - low) / 2;
        int border = points[middle];

        int i = low, j = high;
        while (i <= j)
        {
            while (points[i].compareTo(border) < 0) i++;
            while (points[j].compareTo(border) > 0) j--;
            if (i <= j)
            {
                int swap = points[i];
                points[i] = points[j];
                points[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) SortingPoints(points, low, j);
        if (high > i) SortingPoints(points, i, high);
    }

    public static void main(String[] args) {
        Student<Integer> s1 = new Student<>(20);
        Student<Integer> s2 = new Student<>(30);
        Student<Integer> s3 = new Student<>(15);
        Student<Integer> s4 = new Student<>(50);
        Student<Integer> s5 = new Student<>(45);
        Student<Integer> s6 = new Student<>(15);
        Student<Integer> s7 = new Student<>(35);
        Integer[] students_points = {s1.points(), s2.points(),
                s3.points(), s4.points(), s5.points(),
                s6.points(), s7.points()};
        System.out.println(Arrays.toString(students_points));
        SortingPoints(students_points, 0, students_points.length-1);
        System.out.println(Arrays.toString(students_points));
    }
}
