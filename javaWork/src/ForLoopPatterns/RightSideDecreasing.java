package ForLoopPatterns;
import java.util.Scanner;

public class RightSideDecreasing {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;

        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++) {
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
/**
 *               * * * * *
 *                 * * * *
 *                   * * *
 *                     * *
 *                       *
 */
