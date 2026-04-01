import java.util.*;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Swap two numbers by Prashant Jain (24EARAD124)");
 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first number");
        int n1 = scan.nextInt();
        
        System.out.println("Please enter your second number");
        int n2 = scan.nextInt();
        
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("After swapping these numbers");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
    }
}