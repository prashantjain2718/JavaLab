import java.util.*;

public class SumOfSeriesFactorial {
    public static void main(String[] args) {
        System.out.println("Sum of N factorial series by Prashant Jain (24EARAD124)");
        int i;
        float sum = 0;
        float f = 1;
        System.out.println("Enter a number: ");      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     
        for (i = 1; i <= n; i++) {
            f = 1; 
            for (int j = 1; j <= i; j++) {
                f = f * j; 
            }
            sum = sum + (1 / f);
        }     
        System.out.println("Sum of factorial " + n + " terms is = " + sum);
    }
}