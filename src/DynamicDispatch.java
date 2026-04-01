import java.util.Scanner;

class Vehicle {
    void startEngine() {
        System.out.println("Starting generic vehicle engine.");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started: Vroom Vroom!");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started: Droom Droom!");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic dispatch by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1 to test Drive a Car, or 2 for a Bike: ");
        int choice = sc.nextInt();
        
        Vehicle myVehicle; 
        
        if (choice == 1) {
            myVehicle = new Car(); 
        } else {
            myVehicle = new Bike(); 
        }
        
        myVehicle.startEngine();
    }
}