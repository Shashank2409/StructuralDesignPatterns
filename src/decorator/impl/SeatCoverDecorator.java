package decorator.impl;

import decorator.VehicleDecorator;
import model.Vehicle;

public class SeatCoverDecorator extends VehicleDecorator {
    public SeatCoverDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getSpecs() {
        return decoratedVehicle.getSpecs() + ", Leather seat cover";
    }

    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 30;
    }
}
