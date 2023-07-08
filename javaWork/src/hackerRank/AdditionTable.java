package hackerRank;

import java.util.Scanner;

public class AdditionTable {
    public static void main(String arg[]){
        int num,add;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        sc.close();
        for(add=0;add<=10;add++){
            System.out.println(num+" "+"+"+" "+add+" "+"="+" "+(num+add));
        }

    }
}

