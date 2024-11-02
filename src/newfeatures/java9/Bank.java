package newfeatures.java9;

public interface Bank {

    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    default void executeTransaction(String type,double amount){
        if (type.equals("DEPOSIT")){
            deposit(amount);
            logTransaction(type,amount);
        } else if (type.equals("WITHDRAWAL")) {
            withdraw(amount);
            logTransaction(type,amount);
        } else {
            System.out.println("No Transaction executed");
        }
    }


    // PRivate methods are given in order to supply common logic to default methods in interface methods

   private void logTransaction(String type,double amount) {
       System.out.println("Transaction " + type );
       System.out.println("Amount " + amount);
       System.out.print("Balance " + getBalance());
   }


}
