public class BankAccount {
       public double balance;
       public String name;


    public BankAccount (double balance, String name) {
            this.balance = balance;
            this.name = name;
        }
        public void deposit (double depositAmount) {
            this.balance += depositAmount;
        }

        public void withdrawal (double withdrawAmount){
            this.balance -= withdrawAmount;
        }

    @Override
    public String toString(){
        return name + " account balance: " + balance;
    }
    }
