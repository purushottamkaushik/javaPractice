package newfeatures.java9;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new SavingsBank(1000);
        bank.executeTransaction("WITHDRAWAL",200);
    }
}
