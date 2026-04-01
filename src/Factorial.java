import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Find factorial by Prashant Jain (24EARAD124)");
        int n;
        int i;
        int fact = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        for (i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}