package hackerRank;
import java.util.Scanner;
public class Conditions {
     private static final Scanner scan= new Scanner(System.in);
    public static  void main(String agr[]){
        int n=scan.nextInt();
        if((n % 2)!=0){
            System.out.println("rat");
        }
        else if(2<=n && n<=5){
            System.out.println("cat");
        }
        else if(6<=n && n<=20){
            System.out.println("dog");
        }

        else {
            System.out.println("tiger6cd");
        }

    }
}
