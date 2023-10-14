package ru.mirea.kabo0222.practiceNumber_9_10_11_13_14.practice14.task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String text = "12 EU, 27.3 USD, 128 RUB, 14 PEP, 23.2 DER";
        Pattern pattern = Pattern.compile("([-+]?[0-9]*\\.?[0-9]*\\sUSD|\\d+\\sUSD)|" +
                "([-+]?[0-9]*\\.?[0-9]*\\sRUB|\\d+\\sRUB)|([-+]?[0-9]*\\.?[0-9]*\\sEU|\\d+\\sEU)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}
