package datatest;

public class WeatherReport {

    public static void main(String[] args) {
        String weatherConditionA = "warm";
        String weatherConditionB = "Rain";

        if (weatherConditionA.equals("cold")) {
            System.out.println("Please wear a jacket");
            if (weatherConditionB.equals("sunny")) {
                System.out.println("Please take sunglasses");
            } else {
                System.out.println("Just jacket is fine for today");
            }
        } else if (weatherConditionA.equals("warm")) {
            System.out.println("Please wearT Shirt and shorts");
            if (weatherConditionB.equals("Rain")) {
                System.out.println("Please take the train");
            } else {
                System.out.println("Its not raining so, your all good");
            }
        } else {
            System.out.println("It's not my type of weather:" + weatherConditionA);
        }
    }
}

