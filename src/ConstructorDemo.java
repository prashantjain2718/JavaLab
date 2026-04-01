import java.util.Scanner;

class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Constructor and constructor overloading by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        System.out.println("Student created with default constructor:");
        s1.display();
        
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        
        Student s2 = new Student(id, name);
        System.out.println("Student created with parameterized constructor:");
        s2.display();
    }
}