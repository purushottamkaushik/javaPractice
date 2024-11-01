package src.design.solidPrinciples.singleopc;
public class Marker {
    private String color;
    private String company;
    private Double price;
    private int quantity;

    public Marker(String color, String company, Double price) {
        this.color = color;
        this.company = company;
        this.price = price;
    }

    public Double calculatePrice() {
        return this.price * this.quantity;
    }

    // Multiple responsibilites so change the below code

//    public void saveToDb(){ }
//    public void saveToFile(){ }
    public void printInvoice(){ }
}