package javaTpoint;

public class Operators {
    public static void main(String[] args) {
        int apples=40;
        int bananas=-30;
     //   System.out.println("The apples are ="+apples++);
     //   System.out.println("The apples are ="+ ++apples);
     //   System.out.println(apples--);
     //   System.out.println(--apples);
        //   System.out.println(bananas++ + ++bananas + --apples );


        int a=10;
        int b=-20;
        int c=15;
        System.out.println(~a);                            //"~" is used for minus of total num start from zero
        System.out.println(~b);                           //~  is used for positives of total minus ,positive start from 0


        System.out.println(90+9-4/5-30*8/10);             //Arithmetic operator

        System.out.println(10<<2);                        //left shift operator << ,(10*2^2=10*4)
        System.out.println(6<<3);                         //(6*2^3)=6*8=48
        System.out.println(100<<2);

        System.out.println(20>>2);                        //(20/2^2)=20/4=5
        System.out.println(10>>3);

        System.out.println(a<b&&b<c);                     //if both conditions are true then output is true otherwise false -->bitwise operator
        System.out.println(a>b||b>c);                     // if one condition is true then the output is true-->logical operator


        a+=4;
        b-=4;
        System.out.println(a);
        System.out.println(b);



    }





}
