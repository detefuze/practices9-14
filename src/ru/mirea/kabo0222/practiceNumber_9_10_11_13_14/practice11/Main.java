package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice11;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        long starttime = System.currentTimeMillis();
        Date date1 = new Date(); // Returns the current date and time
        Date date2 = new Date(2024-1900, Calendar.MARCH, 12);
        String formatted1 = formatter.format(date1);
        String formatted2 = formatter.format(date2);

        if(date1.equals(date2))
            System.out.println("Both dates are equal");
        else if(date1.after(date2))
            System.out.printf("%s comes after %s%n", formatted1, formatted2);
        else System.out.printf("%s comes before %s", formatted1, formatted2);

        long endtime = System.currentTimeMillis();
        long duration = endtime-starttime;
        System.out.println("\nВремя выполнения мс: "+duration);
    }
}
