package datatest;

public class homeworkOperatorsExpressions {


        /*
         * Homework:
         * 1. Is your age greater then you brothers/sister's age
         * 2. What two number must be true for you to buy iPhone 10
         * 3. what must not equal to one another
         */

    public static void main(String[] args) {

        //1: Is your age greater then you brothers/sister's age
        int donage = 20;
        int donbro1 = 25;
        int donbro2 = 40;
        boolean Steve = (donbro1 <= donage);
        boolean Jeff = (donbro2 >= donage);

        //Relational Operators
        System.out.println("Don has 2 brothers name Jeff & Steve");
        System.out.println("Don is older than his brother Steve: " + Steve);
        System.out.println("Don is younger than his brother Jeff: " + Jeff);
        System.out.println(" ");

        //2. What two number must be true for you to buy iPhone 10
        int iPhone = 1000;
        int donWallet = 1000;
        double iPhonePrice = 950.50;
        //Conditional Operators
        if ((donWallet >= iPhonePrice) || (iPhone <= iPhonePrice)) {
            System.out.println("Don is going to get an iPhone X");
            System.out.println(" ");
        }

        //3. what must not equal to one another
        int car = 14;
        int parkingSpot = 18;
        //Conditional Operators
        if (!(car <= 13) && (parkingSpot >= 16)) {

            System.out.println("The car will fit in the parking spot.");
        }
    }
}
