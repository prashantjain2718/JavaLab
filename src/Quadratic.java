import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Quadratic by Prashant Jain (24EARAD124)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter coefficient of the Quadratic equation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b * b) - (4 * a * c);
        if (d == 0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are real & equal");
            System.out.println("r1 = " + r1 + " and r2 = " + r1);
        } else if (d > 0) {
            double t = Math.sqrt(d);
            double r1 = (-b + t) / (2.0 * a);
            double r2 = (-b - t) / (2.0 * a);
            System.out.println("The roots are real and distinct");
            System.out.println("r1 = " + r1 + " and r2 = " + r2);
        }  else {
            System.out.println("The roots are imaginary and there is no real solution");
        }
    }
}