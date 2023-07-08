package javaTpoint;

public class Variables {
    static int oppo=2;                                      //static variable
    void main(){
        int onePlus=5;                                      //local variable
        System.out.println(onePlus+"RAM");

    }
    public static void main(String args[]){
        int iphone=4;                                       //instant variable
        System.out.println("OPPO"+" "+oppo+"GB RAM");
        System.out.println("iphone"+" "+iphone+"GB RAM");

        int apple=50;                                       //adding two variables
        int banana=30;
        int a=apple+banana;
        System.out.println(a);

        int heightA=6;                                      //widening(expand)
        float heightB=heightA;
        System.out.println(heightA);
        System.out.println(heightB);

        float marksA=50;                                   //narrowing
        int marksB=(int) marksA;
        System.out.println(marksA);
        System.out.println(marksB);


        int x=170;                                         //using byte datatype
        byte y=(byte) x;
        System.out.println(x);
        System.out.println(y);

        byte pen=15;
        byte pencil=10;
        byte total=(byte) (pen+pencil);
        System.out.println(total);



    }
}
