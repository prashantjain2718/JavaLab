
public class Operator {
	public static void main(String[] args){
		System.out.println("Operator by Prashant Jain (24EARAD124)");
		System.out.println("Arithmetic Opeartor(+,-,*,/,%):");
		int a = 10;
		int b = 2;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		System.out.println("Assignment Operators");
		a = 12; b = a;
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		System.out.println(a=+b);
		System.out.println(a=-b);
		//System.out.println(a=*b);
		//System.out.println(a=/b);
		//System.out.println(a=%b);
		
		System.out.println("Relational Operator:");
		System.out.println("Logical Operator");
		a = 12; 
		b = 4;
		System.out.println((a>b) && (b<a));
		System.out.println((a>b) && (b<a));
		System.out.println(!(a>b));
		
		System.out.println("Unary Operator: ");
		System.out.println("Bitwise Opeartor: ");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~b);
		System.out.println(b<<2);
		System.out.println(b>>2);
		}
}
