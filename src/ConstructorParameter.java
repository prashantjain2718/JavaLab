
public class ConstructorParameter {

	String language;
	
	// Constructor accepting single value 
	ConstructorParameter(String lang) {
		language = lang;
		System.out.println(language + " Programming language");
	}
	public static void main(String[] args) {
		System.out.println("Parameterized Constructor by Prashant Jain(24EARAD124)");
		// Passing different values to distinct objects
		ConstructorParameter obj1 = new ConstructorParameter("Java");
		ConstructorParameter obj2 = new ConstructorParameter("Python");
		ConstructorParameter obj3 = new ConstructorParameter("C");

	}

}
