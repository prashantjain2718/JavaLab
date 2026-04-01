
public class Largest_of_three_nested_if {
	public static void main(String[] args) {
		Double n1 = 10.0, n2 = 4.5, n3 = -5.3, largest;
		if (n1 >= n2) {
			// Inner Check
			if (n1 >= n3) {
				largest = n1;
			} else {
				largest = n3;
			}
		} else { // Outer Else
			if (n2 >= n3) {
				largest = n2;
			} else {
				largest = n3;
			}
		}
		System.out.println("Lagest number is: " + largest);
	}
}
