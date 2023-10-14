package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice14.task2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s1 =  "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");

        Matcher matcher1 = pattern.matcher(s1);
        Matcher matcher2 = pattern.matcher(s2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
