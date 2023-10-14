package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s = {"S001,Black Shirt Polo,Black,XL", "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"};
        Shirts[] shirts = new Shirts[s.length];
        for (int i = 0; i < s.length; ++i)
        {
            shirts[i] = new Shirts(s[i]);
        }
        System.out.println(Arrays.toString(shirts));
    }
}
