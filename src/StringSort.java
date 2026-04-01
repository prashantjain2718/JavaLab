import java.lang.*;

public class StringSort {
    
    static String name[] = {"Orange", "Mango", "Apple", "Banana", "Kiwi"};
    public static void main(String[] args) {
        System.out.println("Sorting names using array by Prashant Jain (24EARAD124)");
        int size = name.length;
        String temp = null;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (name[j].compareTo(name[i]) < 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("After sorted Fruits name are");
        
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}