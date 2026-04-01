
public class Switch_size {
	public static void main(String[] args) {
		int number = 35;
		String size;
		switch (number) {
		case 29:
			size = "Small";
//			break;
		case 42:
			size = "Medium";
//			break;
		case 44:
			size = "Large";
//			break;
		default:
			size = "Unknown";
		}
		System.out.println("The size is: " + size);
	}
}
