package datatest;

public class mathFunction {

    /**
     * Homework: Use below math function and explain in which cases they are
     * being used exp, log, pow, floor, sqrt, ceil, sin, cos, tan, toRadians.
     */

    public static void main(String[] args) {

        //Interger variables
        int intValueOne = 70;
        int vintValueTwo = -20;

        //Double variables
        double dounbleValueOne = 75.8;
        double doubleValueTwo = 0.88;

        // Using math function exp
        System.out.println("Using exp");
        System.out.println("Math.exp(" + dounbleValueOne + ")=" + Math.exp(dounbleValueOne));
        System.out.println("Math.exp(" + doubleValueTwo + ")=" + Math.exp(doubleValueTwo));
        System.out.println(" ");



        // Using math function log
        System.out.println("Using log");
        System.out.println("Math.log(" + dounbleValueOne + ")=" + Math.log(dounbleValueOne));// get the natural logarithm for dounbleValueOne
        System.out.println("Math.log(" + doubleValueTwo + ")=" + Math.log(doubleValueTwo));// get the natural logarithm for doubleValueTwo
        System.out.println(" ");


        // Using math function pow
        System.out.println("Using pow");
        System.out.println("Math.pow(" + dounbleValueOne + "," + doubleValueTwo + ")=" + Math.pow(dounbleValueOne, doubleValueTwo));// print dounbleValueOne raised by doubleValueTwo
        System.out.println("Math.pow(" + doubleValueTwo + "," + dounbleValueOne + ")=" + Math.pow(doubleValueTwo, dounbleValueOne));//doubleValueTwo raised by dounbleValueOne
        System.out.println(" ");


        // Using math function floor
        System.out.println("Using floor");
        System.out.println(Math.floor(dounbleValueOne));//drop to whole number lower
        System.out.println(Math.floor(doubleValueTwo));//drop to whole number lower
        System.out.println(" ");

        // Using math function sqare root/sqrt
        System.out.println("Using sqrt");
        // print the square root of these doubles
        System.out.println("Math.sqrt(" + intValueOne + ")=" + Math.sqrt(intValueOne));
        System.out.println("Math.sqrt(" + vintValueTwo + ")=" + Math.sqrt(vintValueTwo));//Less than Zero
        System.out.println(" ");

        // Using math function ceil
        System.out.println("Using ceil");
        System.out.println(Math.ceil(dounbleValueOne));//raise to whole number higher
        System.out.println(Math.ceil(doubleValueTwo));//raise to whole number higher
        System.out.println(" ");


        // Using math function toRadians
        double x = 45;
        double y = -180;
        System.out.println("Using toRadians");
        x = Math.toRadians(x);// convert them in radian
        y = Math.toRadians(y);// convert them in radian
        System.out.println(x + " and " + y);
        System.out.println(" ");

        // Using math function sin
        System.out.println("Using sin");
        System.out.println("Math.sin(" + x + ")=" + Math.sin(x));
        System.out.println("Math.sin(" + y + ")=" + Math.sin(y));
        System.out.println(" ");


        // Using math function cos
        System.out.println("Using cos");
        System.out.println("Math.cos(" + x + ")=" + Math.cos(x));
        System.out.println("Math.cos(" + y + ")=" + Math.cos(y));
        System.out.println(" ");


        // Using math function tan
        System.out.println("Using tan");
        System.out.println("Math.tan(" + x + ")=" + Math.tan(x));
        System.out.println("Math.tan(" + y + ")=" + Math.tan(y));
        System.out.println(" ");
    }
}









