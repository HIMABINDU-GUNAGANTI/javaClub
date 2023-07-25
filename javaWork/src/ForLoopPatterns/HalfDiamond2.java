package ForLoopPatterns;
import java.util.Scanner;
public class HalfDiamond2 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row,space,col;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row+1;space++){
                System.out.print(" ");
            }
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for(row=1;row<=n;row++){
            for(space=1;space<=row+1;space++){
                System.out.print(" ");
            }
            for(col=1;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
/***
 *                    *
 *                   **
 *                  ***
 *                 ****
 *                *****
 *                 ****
 *                  ***
 *                   **
 *                    *
 *
 *
 *
 *
 */
