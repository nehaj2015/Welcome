import thirtydays.Person;

import java.util.Scanner;

/**
 * @author neha
 */
public class ThirtyDaysOfJava {

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

    /**
     * Day 3: Conditional
     * For int n, print Weird/Not Weird based on
     * Odd = Weird
     * Even = (2-5) Not Weird, (6-20) Weird, (>20) Not Weird
     */

    public static void day3() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }

    /**
     * Day 4: Class vs Instance
     * Deals with the difference between class and instance
     */
    public static void day4() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    /**
     * Day 5: Loops
     * Given an int N, print its 1st 10 multiples
     * N x 1 = N ...
     */

    public static void day5() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for (int i = 1; i < 11; i++) {
            int b = N * i;
            System.out.printf("%d x %d = %d\n", N, i, b);
        }
    }
}
