import java.util.Scanner;

public class CompoundInterest
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();
        System.out.print("Enter the number of times the interest is compounded per year: ");
        int n = sc.nextInt();
        double amount = principal * Math.pow((1 + (rate / 100) / n), n * time);
        double compoundInterest = amount - principal;
        System.out.println("The compound interest is: " + compoundInterest);
        System.out.println("The total amount after " + time + " years is: " + amount);
        scanner.close();
    }
}
