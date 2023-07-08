package hackerRank;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args)
    {
//x and y are the numbers to find the GCF
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd = 1;
//running loop form 1 to the smallest of both numbers
        for(int i = 1; i <= x && i <= y; i++)
        {
//returns true if both conditions are satisfied
            if(x%i==0 && y%i==0)
//storing the variable i in the variable gcd
                gcd = i;
        }
//prints the gcd
        System.out.println("Enter two values");
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }
}