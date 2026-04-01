import java.util.*;
public class Star_Pattern {
	public static void main(String[] args) {
		System.out.println("Star Pattern by Prashant Jain (24EARAD124)");
		int row;
		int column;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		for (row = 1; row <= n; row++) {
			for (column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
