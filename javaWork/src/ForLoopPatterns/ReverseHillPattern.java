package ForLoopPatterns;

import java.util.Scanner;

public class ReverseHillPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row,space,col;
        for(row=1;row<=n;row++){
            for(space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(col=1;col<=n-row+1;col++){
                if(row==1 || col==1 || col==n-row+1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}

/**
 *         *********
 *          *******
 *           *****
 *            ***
 *             *
 *
 *
 */
