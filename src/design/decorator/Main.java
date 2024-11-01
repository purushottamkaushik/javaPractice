package design.decorator;

public class Main {
    public static void main(String[] args) {


      MushroomPizza pizza = new MushroomPizza(new ExtraCheese(new Margreta()));
        System.out.println(pizza.cost());

        BasePizza pizza1 = new ExtraCheese(new
                VegDelight());
        System.out.println(pizza1.cost());
    }
}
