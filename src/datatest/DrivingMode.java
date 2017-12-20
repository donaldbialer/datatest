package datatest;

public class DrivingMode {

    /**
     * I want to be able to put car on P mode, D mode, N mode, R mode
     * If i am on P mode and parking type is parallel then i can park between two cars
     * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
     * If i am on N mode i can put car in car wash station
     * If i am on R mode I can only reverse the car and car will activate back camera
     * If mode is incorrect then print me invalid mode type, please check your car mode
     */

    public static void main(String[] args) {
        String grade = "P mode";

        switch (grade) {
            case "P mode":
                System.out.println("Can parallel park between two cars");
                break;//Without break, will continue to execute code
            case "D mode":
                System.out.println("I can put drive type to Snow type, Sport Type or Regular type");
                break;
            case "N mode":
                System.out.println("I can put car in car wash station");
                break;
            case "R mode":
                System.out.println("I can only reverse the car and car will activate back camera");
                break;
            default:
                System.out.println("invalid mode type, please check your car mode: " + grade);
        }
        System.out.println("Your next line");
    }
}

