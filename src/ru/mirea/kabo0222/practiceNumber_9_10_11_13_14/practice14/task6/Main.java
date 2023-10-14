package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice14.task6;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+@\\w+.com|\\w+@\\w+");
        String str1 = "user@email.com";
        String str2 = "root@localhost";
        String str3 = "myhost@@@com.ru";
        String str4 = "@myru";
        List<Matcher> matchers = Arrays.asList(pattern.matcher(str1), pattern.matcher(str2),
                                                pattern.matcher(str3), pattern.matcher(str4));
        matchers.forEach(s -> System.out.println(s.matches()));
    }
}
