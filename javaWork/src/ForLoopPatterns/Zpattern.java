package ForLoopPatterns;

import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space,row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                if(col==row || row==1 ||row==n)
                System.out.print("* ");
                else System.out.print("  ");
            }
            for(col=1;col<=n-row;col++){
                if(row==1 )
                    System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

/**             * * * * * * * * * * *
 *               *
 *                 *
 *                   *
 *                     *
 *                       *
 *                         *
 *                           *
 *                             *
 *                               *
 *                                 *
 *               ********************
 */
