import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of Digits by Prashant Jain (24EARAD124)");
        int n;
        int rem;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        System.out.print("Sum of digits of a number " + n + " is equal to = ");
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
        }
        System.out.println(sum);
    }
}