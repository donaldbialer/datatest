package datatest;

        import java.text.DateFormat;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;

public class CalHomeWork {

    public static void main(String[] arg) throws ParseException {

        //The current date
        Date myDate = new Date();
        //System.out.println("The current Date is :" +  myDate);
        //System.out.println(" ");


        //Current date format
        //convert format to string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String stingDate = sdf.format(myDate);
        System.out.println("The String for date is: " + stingDate);
        System.out.println(" ");


        //Adding a day
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 1); // Adding 1 days
        String output = sdf3.format(c.getTime());
        System.out.println("Tomorrow's date is: " + output);
        System.out.println(" ");

        //Comparing today's date with tomorrow's date
        boolean compare = stingDate.equals(output);
        System.out.println("The dates are a match: " + compare);
        System.out.println(" ");

        //Parse 1999-11-19 into date format and print the value
        DateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd");
        String testDateString = "1999-11-19";
        Date date = sdf1.parse(testDateString); //Parsing into Date Format
        System.out.println("Date: " + date); //Date value
        String newDatesString = sdf1.format(date); //The Parse date format is now a String
        System.out.println("Date in dd/MM/yyyy format is: " + newDatesString);//Print value
    }
}
