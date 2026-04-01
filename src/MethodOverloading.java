import java.util.Scanner;

public class MethodOverloading {
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Method overloading by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integers to multiply: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Result with integers: " + multiply(num1, num2));
        
        System.out.print("Enter two decimal numbers (doubles) to multiply: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Result with doubles: " + multiply(d1, d2));
    }
}