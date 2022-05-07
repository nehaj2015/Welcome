import java.util.Scanner;

/**
 * @author neha
 */
public class ThirtyDaysofJava {

    /**
     * Day 0: Hello World
     * Read string from input
     * Print "Hello, World"
     * Print input string
     */
    public static void day0() {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }

    /**
     * Day 1: Data Types
     * Read int, double, string from input
     * Sum with corresp. int, double, (concat) string
     * Print
     */
    public static void day1() {
        int i = 5;
        double d = 5.0;
        String s = "Thirty Days:";
        Scanner scan = new Scanner(System.in);

        int myInt = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();
        scan.close();
        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.println(s + myString);
    }

    /**
     * Day 2: Operators
     * Given meal cost, tip percent, tax percent
     * Calculate total meal price, rounded to whole number
     */
    public static void day2() {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double totalBill = mealCost * (tipPercent + taxPercent) / 100.0d;
        totalBill += mealCost;
        int totalCost = (int) Math.round(totalBill);
        System.out.println("The total meal cost is " + totalCost + " dollars.");

    }
}
