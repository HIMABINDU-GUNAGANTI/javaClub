package ForLoopPatterns;
import java.util.Scanner;

public class RightSideIncreasing {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row + 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+(n-(col)));

            }
            System.out.println(" ");
        }
    }
}


/**
 *                       *
 *                      **
 *                     ***
 *                    ****
 *                   *****
 *
 *
 *
 * **/
