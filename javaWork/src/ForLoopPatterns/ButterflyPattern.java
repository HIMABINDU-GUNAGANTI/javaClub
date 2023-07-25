package ForLoopPatterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row,space,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=2*n-1;col++){
                if(col>row && col<row)
                 System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        for(row=1;row<=n;row++){
            for(col=1;col<=2*n-1;col++){
                if(col>n-row+1 && col<n+row-1)
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

/**
*        *       *
*        **     **
*        ***   ***
*        **** ****
*        *********
*        **** ****
*        ***   ***
*        **     **
*        *       *
*
**/