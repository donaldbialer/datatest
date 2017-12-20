package datatest;

import java.util.Random;

public class johnUser {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomValue = rand.nextInt(100) + 1;
        String username = "John" + randomValue;
        System.out.println(username);



    }
}
