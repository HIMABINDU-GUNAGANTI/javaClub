package ForLoopPatterns;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row,col,space;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(col=1;col<=row;col++){
                if(col==1 || col==row )
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
        for(row=1;row<=n;row++){
            for(space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(col=1;col<=n-row;col++){
                if(col==1 || col==n-row)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
/**
 *                         *
 *                        * *
 *                       * * *
 *                      * * * *
 *                     * * * * *
 *                      * * * *
 *                       * * *
 *                        * *
 *                         *
 *
 *
 *
 *
 * */