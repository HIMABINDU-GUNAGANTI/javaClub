package javaTpoint;

public class ContinueStatement {
    public static void main(String[] args) {


        for(int i =0 ; i<= 3; i++) {

            for (int j = i; j<=5; j++) {

                if(j == 6) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
