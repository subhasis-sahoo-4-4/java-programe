import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of even Fibonacci numbers up to " + n + " is: " + sum);
        
        sc.close();
    }
}
