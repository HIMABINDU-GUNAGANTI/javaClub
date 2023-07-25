package ForLoopPatterns;
import java.util.Scanner;
import java.lang.String;
public class HillPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int row, space, col;
        for (row = 1; row <= n; row++) {
            for (space = 1; space <=n - row; space++) {
                System.out.print(" ");
            }
            for (col = 1; col <= 2* row - 1; col++) {
                System.out.print("*");
            }
                System.out.println(" ");
        }
    }
}



/**
 *            *
 *           * *
 *          * * *
 *         * * * *
 *        * * * * *
 */
