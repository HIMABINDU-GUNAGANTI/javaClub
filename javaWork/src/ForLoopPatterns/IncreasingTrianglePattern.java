package ForLoopPatterns;

import java.util.Scanner;

public class IncreasingTrianglePattern {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        char value=65;

        for(int row=1;row<=n;row++ ){
            for(int col=1;col<=row;col++){
                System.out.print(" "+row);

            }
            System.out.println(" ");
        }
    }






}
/**   rows=horizontal
 *    columns=vertical
 *          Always Outer loop for rows
 *                 Inner loop for columns

 *
 *       row-1      *
 *       row-2      * *
 *       row-3      * * *
 *       row-4      * * * *
 *       row-5      * * * * *
 */
