import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Print prime number by Prashant Jain (24EARAD124)");

		int i;
		int j;
		int p = 1;
		int n;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number up to which you want print prime: ");
		n = s.nextInt();

		for (i = 2; i <= n; i++) {
			p = 1;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					p = 0;
					break;
				}
			}
			if (p == 1) {
				System.out.print(i + " ");
			}
		}
	}
}