

public class BankAccountMain {
    public static void main (String[] args) {
        BankAccount myAccount = new BankAccount(500, "My");
        myAccount.deposit(100);
        System.out.println(myAccount);

        BankAccount Larry = new BankAccount(5000, "Larry's");
        Larry.withdrawal(100);
        System.out.println(Larry);

        BankAccount Mary = new BankAccount(300, "Mary's");
        Mary.deposit(100);
        System.out.println(Mary);
    }
}
