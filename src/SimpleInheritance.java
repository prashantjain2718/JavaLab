import java.util.Scanner;

class BaseShape {
    int length;
    int width;

    void setDimensions(int l, int w) {
        length = l;
        width = w;
    }
}

class InheritedRectangle extends BaseShape {
    void displayArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Rectangle class using simple inheritance by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        
        InheritedRectangle rect = new InheritedRectangle();
        rect.setDimensions(l, w);
        rect.displayArea();
    }
}