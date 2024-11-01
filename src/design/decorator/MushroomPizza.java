package design.decorator;

public class MushroomPizza extends ToppingDecorator{

    BasePizza basePizza;
    public MushroomPizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
