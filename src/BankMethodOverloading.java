import java.util.Scanner;

class Bank {
    void deposit(int amount) {
        System.out.println("Deposited cash amount: Rs. " + amount);
    }
    
    void deposit(int amount, String chequeNumber) {
        System.out.println("Deposited cheque amount: Rs. " + amount + " | Cheque Number: " + chequeNumber);
    }
}

public class BankMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Bank class using method overloading by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        Bank myBank = new Bank();
        
        System.out.print("Enter cash amount to deposit: ");
        int cash = sc.nextInt();
        myBank.deposit(cash);
        
        System.out.print("Enter cheque amount to deposit: ");
        int chequeAmount = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter cheque number: ");
        String chequeNum = sc.nextLine();
        myBank.deposit(chequeAmount, chequeNum);
    }
}