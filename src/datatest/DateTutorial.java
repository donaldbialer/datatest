package datatest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTutorial {

    public static void main(String[] arg) throws ParseException {
        Date myDate = new Date();
        //System.out.println(myDate);

        //convert format to string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String stingDate = sdf.format(myDate);
        System.out.println(stingDate);

        //convert string to date


        DateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
        String testDateString = "1999-11-19";
        Date date = sdf1.parse(testDateString);
        System.out.println("Date: " + date);
        String newDatesString = sdf1.format(date);
        System.out.println("Date in dd/MM/yyyy format is: " + sdf1.format(date));
        System.out.println(newDatesString);
    }
}
