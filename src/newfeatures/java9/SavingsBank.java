package newfeatures.java9;

public class SavingsBank implements Bank {

    int balance;

    public SavingsBank(int balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
          return   this.balance;
    }

    @Override
   public void deposit(double amount) {
        this.balance +=amount;

    }

    @Override
   public void withdraw(double amount) {
        this.balance -= amount;
    }

}
