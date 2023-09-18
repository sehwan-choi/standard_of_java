package dataformat;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocaleFormatterTest {

    public static void main(String[] args) {
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String shortFormatLocalDateTime = shortFormatter.format(ZonedDateTime.now());
        print("FormatStyle.SHORT", shortFormatLocalDateTime);

        DateTimeFormatter longFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String longFormatLocalDateTime = longFormatter.format(ZonedDateTime.now());
        print("FormatStyle.LONG", longFormatLocalDateTime);

        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        String mediumFormatLocalDateTime = mediumFormatter.format(ZonedDateTime.now());
        print("FormatStyle.MEDIUM", mediumFormatLocalDateTime);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String fullFormatLocalDateTime = fullFormatter.format(ZonedDateTime.now());
        print("FormatStyle.FULL", fullFormatLocalDateTime);
    }

    public static void print(String str, Object obj) {
        System.out.println(str + " : " + obj);
    }
}
