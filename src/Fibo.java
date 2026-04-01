public class Fibo {
    public static void main(String[] args) {
        System.out.println("Fibonacci series by Prashant Jain (24EARAD124)");
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a+" ");
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}