package datatest;
import java.util.Calendar;

public class LoopCalendar {

    public static void main(String[] arg) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        for (String name : months) {
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            boolean CurrentMonth = name.equals("March");
            if (CurrentMonth == true) {
                System.out.println("The current month is " + CurrentMonth);
                System.out.println(month);

                break;

            }
        }

    }
}