import java.util.Scanner;

class CollegeStudent {
    String name;

    void setName(String n) {
        name = n;
    }
}

class StudentMarks extends CollegeStudent {
    int totalMarks;

    void setMarks(int m) {
        totalMarks = m;
    }
}

class StudentResult extends StudentMarks {
    void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        if (totalMarks >= 40) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("Multilevel inheritance by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        StudentResult res = new StudentResult();
        
        System.out.print("Enter student name: ");
        String n = sc.nextLine();
        res.setName(n);
        
        System.out.print("Enter total marks (out of 100): ");
        int m = sc.nextInt();
        res.setMarks(m);
        
        System.out.println("--- Result Details ---");
        res.displayResult();
    }
}