package datatest;

import java.util.Scanner;

/**
 * Build a gorcery budget system using while loop
 * User can purchase as many item he wishes within the budget limit of $100.00
 * IF the purchased amount exceeds the budget amount, notify the user with appropriate message
 * you must spend all of budget amount
 * Make sure to test your code and avoid possible bugs.
 */

public class GroceryScannerHomework {

    public static void main(String[] args) {

        // Set up grocery cart of 100
        double groceryCapacity = 100.00, priceItem;
        //Instance of scanner
        Scanner thePrice = new Scanner(System.in);  //setting up scanner function
        System.out.println("Please enter the amount of grocery item: ");

        while (groceryCapacity > 0) {
            System.out.println("You have $" + groceryCapacity + ".  Please enter price.");
            System.out.println(priceItem = thePrice.nextDouble());

            if (priceItem < groceryCapacity) {
                groceryCapacity -= priceItem;
            }

            if (priceItem < 0) {
               groceryCapacity += priceItem;
               System.out.println("Please enter a valid amount");
            }
            if (groceryCapacity < priceItem) {
                System.out.println("You are over budget.");
            }
            else if (priceItem == groceryCapacity) {
                groceryCapacity = 0;
                System.out.println("The money is spent.  Enjoy your food.");
            }

        }
    }
}




       /*
        });
        //Setting up the count
        double i = thePrice.nextDouble();
        //Creating while statements to count the amount until you reach $100
         {
            thePrice.nextLine();
            double updatedGroceryCapacity = groceryCapacity - i;
            if(updatedGroceryCapacity >=i){
                System.out.println("You have spent $" + i );
            }
            System.out.println("You can buy $" + updatedGroceryCapacity + " of food");
            System.out.println("Please enter grocery amount");
            //System.out.println(in.nextLine());

            if (!thePrice.hasNextDouble())
                break;
            i += thePrice.nextDouble();
        }
        System.out.println("User has spent more than $100");

            i++;
        }
    }
    */



