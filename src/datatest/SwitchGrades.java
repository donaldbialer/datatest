package datatest;

public class SwitchGrades {

    public static void main(String[] args) {
        String grade = "D";

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;//Without break, will continue to execute code
            case "B":
            case "C":
                System.out.println("Well Done");
                break;
            case "D":
                System.out.println("You Passed");
                break;
            default:
                System.out.println("your grade is not in the list: " + grade);
        }
        System.out.println("Your next line");


    }
}

