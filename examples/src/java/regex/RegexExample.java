package regex;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    @Test
    public void someRegexTest(){
        // регулярное выражение
        // любой один символ от a-z в нижнем регистре
        Pattern pt1 = Pattern.compile("[a-z]");

        // любой один символ от a-z в нижнем и верхнем регистрах
        Pattern pt2 = Pattern.compile("[a-zA-Z]");

        // любой один символ от a-z в нижнем и верхнем регистрах включая цифры
        Pattern pt3 = Pattern.compile("[a-zA-Z0-9]");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c определенным количеством повторений
        Pattern pt4 = Pattern.compile("([a-zA-Z0-9]){4}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений
        Pattern pt5 = Pattern.compile("([a-zA-Z0-9]){3,5}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах
        Pattern pt6 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){1,5}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах + один пробел в конце строки
        Pattern pt7 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){1,5}[\\s]");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах + заданное количество пробелов в конце строки
        Pattern pt8 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){1,5}[\\s]{1,3}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах + произвольное количество пробелов в конце строки
        Pattern pt9 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){1,5}[\\s]{0,}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах + произвольное количество пробелов + как минимум один символ + возможно(0, 1) точка
        Pattern pt10 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){1,5}[\\s]{0,}([a-zA-Z0-9&&[^fF]]){1,}[\\.]{0,1}");

        // любой символ от a-z в нижнем и верхнем регистрах включая цифры c произвольным количеством повторений,
        // кроме символа f в двух регистрах + произвольное количество пробелов + как минимум один символ + возможно(0, 1) точка
        //+ как минимум(1, ) один пробел
        Pattern pt11 = Pattern.compile("([a-zA-Z0-9&&[^fF]]){0,1}[\\s]{0,}([a-zA-Z0-9&&[^fF]]){1,10}[\\.]{0,1}[\\s]{1,}");

        // проверяемая строка
        Matcher m = pt11.matcher("GT.");

        boolean result = m.matches();

        System.out.println(result);

    }

    @Test
    public void emailValidationWithRegex() {
        Pattern pt1 = Pattern.compile("(([a-z]){1,}[\\-]{0,1}([a-z]){1,}[\\.]{0,1}([a-z]){1,})+" +
                                      "@([a-z]){1,}[\\-]{0,1}([a-z]){1,}[\\.]{0,1}([a-z]){1,}" +
                                      "([\\.]{1}([a-z]){2,4})+");


        Pattern pt2 = Pattern.compile("(([a-z]){1,}[\\.-]{0,1}([a-z]){1,})+"
                                    + "@(([a-z]){1,}[\\.-]{0,1}([a-z]){1,})+"
                                    + "([\\.]{1}([a-z]){2,4})+");

        //[a-zA-Z0-9_] == \\w
        //[a-zA-Z0-9]{1,} == \\w+
        //{0,1} == ?
        //()+ == *

        Pattern pt3 = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+");

        Matcher m = pt3.matcher("deyneko-email.onedeyneko-email.one@gmail-name.com.ua.com");

        boolean result = m.matches();

        System.out.println("email-valid: " + result);
    }

    @Test
    public void tailand(){
        final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - " +
                "мечты сбываются!";

        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

    }

    @Test
    public void testFile(){
        final String TEXT = "Username Password";

        String s = "Hello";
        s = s + " woild!";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" world!");
        String newString = sb.toString();

        System.out.printf("I'm %s years old!", Math.random());
    }
}
