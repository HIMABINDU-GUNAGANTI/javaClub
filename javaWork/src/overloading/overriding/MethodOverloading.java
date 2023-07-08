package overloading.overriding;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading alia=new MethodOverloading();

        MethodOverloading sam =new MethodOverloading();

        MethodOverloading raj=new MethodOverloading();

        MethodOverloading david=new MethodOverloading();

        alia.BankAccount();
        sam.BankAccount(156535,"hyderabad");
        raj.BankAccount("90Do",1200.0f);
        david.BankAccount("state bank of india");

    }
    public static void BankAccount() {
        System.out.println("David details");
    }

    public static void BankAccount(String BankAccountName) {
        System.out.println("david details:");
    }

    public static void BankAccount(int BankAccountNumber, String BankAccountAddress) {
        System.out.println("david details:");
    }

    public static void BankAccount(String BankAccountCode,float BankAccountBalance) {
        System.out.println("david details:");
    }
}

/** i create a java class i.e MethodOverloading
 * MethodOverLoading and MethodOverriding is derived from polymorphism
 * MethodOverLoading is a compile Time polymorphism
 * MethodOverLoading have different aruguments
 * in this MethodOverLoading i created abjects
 **/
