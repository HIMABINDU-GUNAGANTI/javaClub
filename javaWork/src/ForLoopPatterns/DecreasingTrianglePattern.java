package ForLoopPatterns;

import java.util.Scanner;

public class DecreasingTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(" "+(n-row+1));
            }
            System.out.println(" ");
        }
    }
}
/**        rows are increasing but columns are decreasing
 *                                        * * * * * *
 *                                        * * * * *
 *                                        * * * *
 *                                        * * *
 *                                        * *
 *                                        *

 * **/