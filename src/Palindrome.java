import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Check string palindrome or not by Prashant Jain (24EARAD124)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your string = ");
        String s = sc.next();
        StringBuffer temp = new StringBuffer(s);
        temp.reverse();
        String str2 = new String(temp);
        if (s.equals(str2)) {
            System.out.println("The given string " + s + " is Palindrome");
        } else {
            System.out.println("The given string " + s + " is not Palindrome");
        }
    }
}