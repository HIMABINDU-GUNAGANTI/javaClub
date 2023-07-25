package ForLoopPatterns;

import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row,space,col;
        for(row=1;row<=n;row++){
            for(space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(col=1;col<=n-row+1;col++){
                System.out.print(" "+(col+row-1));
            }
            System.out.println(" ");
        }
        for(row=1;row<n;row++){
            for(space=1;space<=n-row-1;space++){
                System.out.print(" ");
            }
            for(col=1;col<=row+1;col++){
                System.out.print(" "+(col+(n-row-1)));
            }
            System.out.println(" ");
        }
    }
}
/**                    * * * * *
 *                      * * * *
 *                       * * *
 *                        * *
 *                         *
 *                        * *
 *                       * * *
 *                      * * * *
 *                     * * * * *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * **/