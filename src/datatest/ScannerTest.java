package datatest;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        //Scanner code
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String myName = input.nextLine();
        System.out.println("My name is " + myName);

    }
}
