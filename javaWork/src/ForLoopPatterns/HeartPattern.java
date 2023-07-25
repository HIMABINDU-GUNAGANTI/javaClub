package ForLoopPatterns;

import java.util.Scanner;

public class HeartPattern {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row,space,col;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(col=1;col<=2*row-1;col++){
                if(row==1 || row==2)
                System.out.print(" ");
                else System.out.print("*");
            }
            for(space=1;space<=n-row+1;space++){
                System.out.print(" ");
            }
            for(space=1;space<=n-row+1;space++){
                System.out.print(" ");
            }
            for(col=1;col<=2*row-1;col++){
                if(row==1 || row==2)
                    System.out.print(" ");
                else System.out.print("*");

            }
            System.out.println();
        }
        for(row=1;row<=n;row++) {
            for (space = 1; space <=2*row; space++) {
                if(space ==2*row)
                System.out.print("*");
                else System.out.print(" ");
            }
            for(col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            for(col=1;col<=n-row;col++){
                System.out.print("*");
            }
            for(col=1;col<=n-row;col++){
                System.out.print("*");
            }
            for(col=1;col<=n-row;col++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
