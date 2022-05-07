import java.util.Scanner;

/**
 * @author neha
 * Class to hold methods for introduction to java lessons
 */
public class Introduction {

    /**
     * Prints the Hello World message to stdout
     */
    public static void welcome() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    /**
     * Get input of 3 integers from stdin,
     * print to stdout
     */
    public static void stdinstdout1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * Get input of int, double, string
     * print to stdout
     */
    public static void stdinstdout2(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }

    /**
     * Print formatted output
     * 1st column is left justified with upto 15 spaces
     * 2nd column is exactly 3 digits with leading zero
     *
     */
    public static void formatoutput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
    }

}
