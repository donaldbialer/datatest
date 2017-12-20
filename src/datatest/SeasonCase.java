
package datatest;

import java.util.Calendar;

public class SeasonCase


{
    static int month = Calendar.getInstance().get(Calendar.MONTH) +1;
    public static void main(String[] args) {
        //Months in Java Calendar are 0-indexed
        //int month = Calendar.getInstance().get(Calendar.MONTH) +1;
        String [] monthName = {"Jan.", "Feb", "March", "April", "May", "June", "July", "August", "Sept", "Oct", "Nov", "Dec"};
        System.out.println("Current month: " + month);

        System.out.println("***** The Current Season *****");
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter and the month is " + monthName[11]);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring " + monthName[11]);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer " + monthName[11]);
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is fall "  + monthName[11]);
                break;

            default:
                System.out.println("Something wrong");
                break;
        }
    }
}

