package src.design.strategy.impl;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
