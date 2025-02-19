//Check whether the input number is a Neon Number
import java.util.Scanner;
class NeonNumber 
{
    public static void main(String[] args) 
{
        
        int num = 9;

        int square = num * num;

        int sum = 0;
        int temp = square;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        if (sum == num) 
{
            System.out.println(num + " is a Neon Number.");
        } 
        else 
{
            System.out.println(num + " is not a Neon Number.");
        }
    }
}