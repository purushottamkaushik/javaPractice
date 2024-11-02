package newfeatures.java16;

public record CustomerRecord(int customerId,
                             String customerName,
                             String address) {
    // Default they are immutable only used for setting data that is immutable


    public CustomerRecord {
        if (customerId <10) {
            throw new IllegalArgumentException("Customer id cannot be less than 10");
        }
    }


    public String getCustomer(){
        return this.customerName;
    }

}
