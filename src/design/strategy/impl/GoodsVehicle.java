package src.design.strategy.impl;

public class SportsVehicle  extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
