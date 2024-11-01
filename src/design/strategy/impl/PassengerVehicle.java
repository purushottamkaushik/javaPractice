package src.design.strategy.impl;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
