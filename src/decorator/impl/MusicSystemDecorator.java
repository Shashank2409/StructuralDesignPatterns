package decorator.impl;

import decorator.VehicleDecorator;
import model.Vehicle;

public class MusicSystemDecorator extends VehicleDecorator {
    public MusicSystemDecorator(Vehicle vehicle) {
        super(vehicle);
    }
    @Override
    public String getSpecs() {
        return decoratedVehicle.getSpecs() + ", Sony WX-BTM920";
    }

    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 100;
    }
}
