package design.strategy.impl;


public class Main {
    public static void main(String[] args) {

        src.design.strategy.impl.Vehicle v = new src.design.strategy.impl.GoodsVehicle();
        
        v.drive();
        v = new src.design.strategy.impl.OffRoadVehicle();
        v.drive();

        v = new src.design.strategy.impl.PassengerVehicle();
        v.drive();

        v = new src.design.strategy.impl.SportsVehicle();
        v.drive();
    }
}
