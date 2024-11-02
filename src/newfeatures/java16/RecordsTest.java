package newfeatures.java16;

public class RecordsTest {

    public static void main(String[] args) {
        CustomerRecord record = new CustomerRecord(102,"Purushottam","sonipat");
        System.out.println(record);

        CustomerRecord secondRecord = new CustomerRecord(13,"Smamta","sonipat");
        System.out.println(secondRecord);

        System.out.println("Address " + record.address() );
        System.out.println("name " + record.customerName());
        System.out.println("customer name " + record.getCustomer());
    }
}
