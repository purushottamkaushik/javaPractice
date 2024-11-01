package src.design.strategy.impl;

public class OwnVehicle extends Vehicle{

    public OwnVehicle() {
        super(new HeavyDriveStrategy());
    }
}
