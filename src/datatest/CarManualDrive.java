package datatest;

import javax.swing.*;

public class CarManualDrive {

    /**
     * I want to be able to put car on P mode, D mode, N mode, R mode
     * If i am on P mode and parking type is parallel then i can park between two cars
     * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
     * If i am on N mode i can put car in car wash station
     * If i am on R mode I can only reverse the car and car will activate back camera
     * If mode is incorrect then print me invalid mode type, please check your car mode
     */

    public static void main(String[] args) {
        String PMode = "Parallel";
        String DMode = "Regular";
        String NMode = "Neutral";
        String RMode = "Reverse";

        if (PMode.equals("Parallel")) {
            System.out.println("Car will park in between 2 cars");
        } else {
            System.out.println("Continue to look for parking");
        }
        if (DMode.equals("Snow")) {
            System.out.println("Car will be put to Snow Type");
        } else if (DMode.equals("Sport")) {
            System.out.println("Car will be put to Sport Type");
        } else if (DMode.equals("Regular")) {
            System.out.println("Will drive car to Car Wash");
            if (NMode.equals("Nuetral")) {
                System.out.println("The car is ready to roll through the car was");
            } else {
                System.out.println("Put the car in Neutral so it can be washed");
            }
        }
        if (RMode.equals("Reverse")) {
            System.out.println("As I am backing out, the rear camera will help guide me");
        } else {
            System.out.println("The rear camera is off because the care is not in reverse");
        }
    }
}



