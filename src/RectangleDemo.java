import java.util.Scanner;

class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(int side) {
        length = side;
        width = side;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void displayArea() {
        int area = length * width;
        System.out.println("Area: " + area);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        System.out.println("Rectangle using constructor overloading by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle (zero parameters):");
        r1.displayArea();
        
        System.out.print("Enter side length for a square: ");
        int side = sc.nextInt();
        Rectangle r2 = new Rectangle(side);
        System.out.println("Square (one parameter):");
        r2.displayArea();
        
        System.out.print("Enter length for a rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter width for a rectangle: ");
        int w = sc.nextInt();
        Rectangle r3 = new Rectangle(l, w);
        System.out.println("Rectangle (two parameters):");
        r3.displayArea();
    }
}