import java.util.Scanner;

public class SimpleMethod {
    
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to learning Java methods.");
    }

    public static void main(String[] args) {
        System.out.println("Simple method by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        
        greetUser(userName);
    }
}