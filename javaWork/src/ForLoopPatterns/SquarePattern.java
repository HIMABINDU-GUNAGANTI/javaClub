package ForLoopPatterns;


import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row,space,col;
        for( row=1;row<=n;row++){
            for( col=1;col<=n;col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}




/**
 *              * * * * * *
 *              * * * * * *
 *              * * * * * *
 *              * * * * * *
 *              * * * * * *
 *              * * * * * *
 *
 *
 * **/