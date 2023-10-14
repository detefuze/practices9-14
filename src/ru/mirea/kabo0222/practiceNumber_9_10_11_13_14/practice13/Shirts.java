package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice13;
import java.util.*;
public class Shirts {
    private final ArrayList<String> number = new ArrayList<>();
    private final ArrayList<String> name = new ArrayList<>();
    private final ArrayList<String> color = new ArrayList<>();
    private final ArrayList<String> size = new ArrayList<>();

    public Shirts(String shirt)
    {
        int lstind = shirt.lastIndexOf(",");
        int fstind = shirt.indexOf(",");
        int secind = shirt.indexOf(",", shirt.indexOf(",")+1);
        number.add(shirt.substring(0, fstind));
        name.add(shirt.substring(fstind+1, secind));
        color.add(shirt.substring(secind+1, lstind));
        size.add(shirt.substring(lstind+1));
    }

    @Override
    public String toString() {
        return name+"{" +
                "number=" + number +
                ", color=" + color +
                ", size=" + size +
                "}\n";
    }
}
