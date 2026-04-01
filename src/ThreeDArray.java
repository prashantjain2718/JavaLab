import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        System.out.println("3D array by Prashant Jain(24EARAD124)");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of 2D arrays (depth): ");
        int depth = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][][] arr = new int[depth][rows][cols];
        
        System.out.println("Enter the elements for the 3D array:");
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        
        System.out.println("Printing the 3D array:");
        for (int i = 0; i < depth; i++) {
            System.out.println("Array " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}