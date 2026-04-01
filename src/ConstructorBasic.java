
public class ConstructorBasic {

	private String name;

	// Constructor
	private ConstructorBasic() {
		System.out.println("Constructor Called");
		name = "Java";
	}

	public static void main(String[] args) {
		System.out.println("Constructors by Prashant Jain(24EARAD124)");
		// Constructor is invoked implicitly here
		ConstructorBasic obj = new ConstructorBasic();
		System.out.println("The name is " + obj.name);

	}
}
