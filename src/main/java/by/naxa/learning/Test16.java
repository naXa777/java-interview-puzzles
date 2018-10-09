package by.naxa.learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Q: Which of the following methods will take transform input string "2018/10/09"  to output string "09 - 10 - 2018"?
 * A: {@code optionA()}
 */
public class Test16 {

    private static final String DATE_STRING = "2018/10/09";

    public static void main(String... args) throws ParseException {
        optionA();
        optionB();
        optionC();
        optionD();
    }

    private static void optionA() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse(DATE_STRING);
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(sdf.format(date));
    }

    private static void optionB() throws ParseException {
        String date = new SimpleDateFormat("yyyy/MM/dd").format(DATE_STRING);
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(sdf.parse(date));
    }

    private static void optionC() throws ParseException {
        String date = new SimpleDateFormat("dd - MM - yyyy").format(DATE_STRING);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.parse(date));
    }

    private static void optionD() throws ParseException {
        Date date = new SimpleDateFormat("dd - MM - yyyy").parse(DATE_STRING);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(date));
    }

}
