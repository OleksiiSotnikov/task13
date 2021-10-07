package task13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.LocalDateTime.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("дней, часов, минут и секунд проходит между " +
                "началом лекции во вторник и концом лекции в субботу");

        LocalDateTime Tuesday = of(2021, 10, 5, 20, 0);
        LocalDateTime Saturday = of(2021, 10, 9, 18, 0);
        Duration duration1 = Duration.between(Tuesday, Saturday);

        System.out.println("Промежуток в днях: " + duration1.toDays());
        System.out.println("Промежуток в часах: " + duration1.toHours());
        System.out.println("Промежуток в минутах: " + duration1.toMinutes());
        System.out.println("Промежуток в секундах: " + duration1.toSeconds());
        System.out.println();

        System.out.println("количество минут и секунд в лекции");

        LocalDateTime begin = of(2021, 10, 9, 16, 0);
        LocalDateTime end = of(2021, 10, 9, 18, 0);
        Duration duration2 = Duration.between(begin, end);

        System.out.println("Количество минут: " + duration2.toMinutes());
        System.out.println("Количество секунд: " + duration2.toSeconds());
        System.out.println();

        System.out.println("парсить строку");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd h:mm:ss a", Locale.ENGLISH);
        String input = "1999/Jun/18 07:34:56 PM";
        LocalDateTime DateTime = parse(input, dateTimeFormatter);

        System.out.println(DateTime);
        System.out.println();

        System.out.println("форматировать дату в строку");

        LocalDateTime DateTimer = of(2001, 9, 1, 23, 56);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        String result = DateTimer.format(formatter);

        System.out.println(result);
    }
}