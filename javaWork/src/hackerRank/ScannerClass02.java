package hackerRank;
import java.util.Scanner;

public class ScannerClass02 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double b=scan.nextDouble();
        int a=scan.nextInt();

        scan.nextLine();
        String c=scan.nextLine();
        System.out.println("int:"+a);

        System.out.println("String:"+ c);
        System.out.println("Double:"+b);

    }
}
