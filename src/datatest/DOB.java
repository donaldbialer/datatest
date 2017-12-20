package datatest;

public class DOB {
    public static void main (String[] args) {
        int yob = 1960;
        int currentYear = 2017;
        int age = currentYear - yob;
        boolean hadBirthday = false;

            if (hadBirthday) {
                System.out.println("You've already had your birthday so you age is " + age);
            } else {
                //Since you did not have your birthday, we will remove 1 from your age
                age--;
                System.out.println("You did not have your birthday, therefore your age is " + age);

            }
        }
    }


