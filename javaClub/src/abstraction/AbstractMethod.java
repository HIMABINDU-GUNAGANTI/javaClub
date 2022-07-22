package abstraction;

public class AbstractMethod {
}
abstract class Atm{
    int atmNumber;
    String atmAdderess;
    String atmName;
    public Atm(int atmNumber, String atmAdderess, String atmName) {
        this.atmNumber = atmNumber;
        this.atmAdderess = atmAdderess;
        this.atmName = atmName;
    }
    static void atmDetails(){
        System.out.println("welcome to ATM");
    }
    final void atmCard(){
        System.out.println( "thank you for transition");
    }
    abstract void audio();
}
class voiceMessage extends Atm{
    public voiceMessage(int atmNumber, String atmAdderess, String atmName) {
        super(atmNumber, atmAdderess, atmName);
    }
    void send(){
        System.out.println("implimentation hide");
    }
    public static void main(String[] args) {
        System.out.println("functionality shows");
        Atm hima=new Atm(467,"Mumbai","SBI") {
            @Override
            void audio() {
            }
        };
    }
    @Override
     void audio() {
    }
 }



 /**
  * here abtract is a keyWord
  *abstraction is hides the implimentation and it shows only functionality
  * examples for abstraction are -ATM transition,Gmail passwords
  * here i created two classes one is parent ie ATM and child is voiceMessage
  *abstraction can have method and non methods
  *can't use instantiations
  *must have construtor and also static method
  **/




