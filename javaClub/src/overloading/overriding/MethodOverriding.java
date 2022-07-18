package overloading.overriding;

public class MethodOverriding {


    public  class AlexaAccount {
        public void account(){
            System.out.println("Alexa account is executed");
        }
    }
    public class AliaAccount extends AlexaAccount {
        public void account() {
            System.out.println("alia account is executed");
        }
    }
    public class RiaAccount extends AlexaAccount{
        public void account() {
            System.out.println("ria account is executed ");
        }
    }
    public class MitraAccount extends AlexaAccount {
        public void account() {
            System.out.println("mitra account is executed");
        }
    }



    public static void main(String[] args) {

        AlexaAccount alia=new AliaAccount();


        alia.account();

    }
}
