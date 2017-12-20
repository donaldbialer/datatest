package datatest;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AssignmentOperator {
    public static void main(String[] args) throws ParseException {
        //1. Simple Assignment Operator
        System. out .println( "**********Simple Assignment Operator*********" );
        int value = 10;
        System. out .println( "value is " +value);


        //+= Assignment Operator
        System. out .println( "********** += Assignment Operator*********" );
        int value1 = 4;
        int value2 = 8;
        value2 += value1;
        System. out .println( "value1 is " +value1);
        System. out .println( "value2 is " +value2);
//
        System. out .println( "********** -= Assignment Operator*********" );
        value1 = 4;
        value2 = 8;
        value2 -= value1;
        System. out .println( "value1 is " +value1);
        System. out .println( "value2 is " +value2);
//
        System. out .println( "********** *= Assignment Operator*********" );
        value1 = 4;
        value2 = 8;
        value2 *= value1;
        System. out .println( "value1 is " +value1);
        System. out .println( "value2 is " +value2);
//
        System. out .println( "********** /= Assignment Operator*********" );
        //value1 = 4;
        //value2 = 8;
        value2 /= value1;
        System. out .println( "value1 is " +value1);
        System. out .println( "value2 is " +value2);
//
        System. out .println( "********** %= Assignment Operator*********" );
        int  value3 = 8;
        int value4 = 2;
        value4 %= value3;
        System. out .println( "value3 is " + value3);
        System. out .println( "value4 is " + value4);
    }
}
