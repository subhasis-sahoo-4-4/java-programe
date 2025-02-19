import java.util.Scanner;

public class SpiralNumber 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        int[][] spiralMatrix = new int[n][n];

        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;

        while (left <= right && top <= bottom)
 {
            for (int i = left; i <= right; i++) 
{
                spiralMatrix[top][i] = num++;
            }
            top++;


            for (int i = top; i <= bottom; i++)
 {
                spiralMatrix[i][right] = num++;
            }
            right--;

            if (top <= bottom)
 {
                for (int i = right; i >= left; i--)
 {
                    spiralMatrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right)
 {
                for (int i = bottom; i >= top; i--)
 {
                    spiralMatrix[i][left] = num++;
                }
                left++;
            }
        }
        for (int i = 0; i < n; i++)
 {
            for (int j = 0; j < n; j++) 
{
                System.out.print(spiralMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
