
public class ConstructorOverload {

	String language;
	
	// Constructor 1: No parameter
	ConstructorOverload(){
		this.language = "Java";
	}
	
	// Constructor 2: Single parameter
	ConstructorOverload(String language) {
		this.language = language;
	}
	
	public static void main(String[] args) {
		System.out.println("Constructor Overloading by Prashant Jain(24EARAD124)");
		ConstructorOverload obj1 = new ConstructorOverload();
		ConstructorOverload obj2 = new ConstructorOverload("Python");
		System.out.println("Language(No parameter) = " + obj1.language);
		System.out.println("Language(Parameter) = " + obj2.language);
	}

}
