import java.util.Scanner;

class CentralBank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends CentralBank {
    double getInterestRate() {
        return 7.5;
    }
}

class HDFC extends CentralBank {
    double getInterestRate() {
        return 8.2;
    }
}

public class BankMethodOverriding {
    public static void main(String[] args) {
        System.out.println("Bank class using method overriding by Palak Agarwal(24EARAD115)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1 to check SBI interest rate, or 2 for HDFC: ");
        int choice = sc.nextInt();
        
        CentralBank bank;
        
        if (choice == 1) {
            bank = new SBI();
        } else {
            bank = new HDFC();
        }
        
        System.out.println("The interest rate is: " + bank.getInterestRate() + "%");
    }
}
