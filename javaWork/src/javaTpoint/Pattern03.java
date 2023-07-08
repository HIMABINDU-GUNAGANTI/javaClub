package javaTpoint;

public class Pattern2 {
    public static void main(String[] args) {
        int n=8;
        for(int row=1;row<=n;row++){
            for (int col=row;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}