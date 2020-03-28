package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusRegular {
    public static String replaceUnknownBusNumber(String text, String changeStr) {
        Pattern pattern = Pattern.compile("\\bbus#([0-9]){1,3}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll(changeStr);
        return text;
    }
}
