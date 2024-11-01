package src.design.strategy.impl;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new HeavyDriveStrategy());
    }
}
