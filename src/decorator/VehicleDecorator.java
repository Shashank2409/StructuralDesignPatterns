package decorator;

import model.Vehicle;
import model.impl.VehicleImpl;

public abstract class VehicleDecorator implements Vehicle {
    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.decoratedVehicle = vehicle;
    }

    @Override
    public String getName() {
        return decoratedVehicle.getName();
    }
}
