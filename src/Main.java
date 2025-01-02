import decorator.impl.MusicSystemDecorator;
import decorator.impl.SeatCoverDecorator;
import model.Vehicle;
import model.VehicleComponent;
import model.impl.BackDoor;
import model.impl.SideDoor;
import model.impl.VehicleDoor;
import model.impl.VehicleImpl;

public class Main {
    public static void main(String args[]) {
        VehicleComponent sideDoor1 = new SideDoor("leftFront", 100);
        VehicleComponent sideDoor2 = new SideDoor("rightFront", 100);
        VehicleComponent sideDoor3 = new SideDoor("leftBack", 100);
        VehicleComponent sideDoor4 = new SideDoor("rightBack", 100);
        VehicleComponent backDoor = new BackDoor("trunkDoor", 500);

        VehicleDoor allDoors = new VehicleDoor();
        allDoors.setName("bmwDoors");
        allDoors.addDoor(sideDoor1);
        allDoors.addDoor(sideDoor2);
        allDoors.addDoor(sideDoor3);
        allDoors.addDoor(sideDoor4);
        allDoors.addDoor(backDoor);

        System.out.printf("%s prices: %s", allDoors.getName(), allDoors.getPrice());

        Vehicle bmw = new VehicleImpl("BMW", 50000, "Black color");
        System.out.printf("Specs for %s are: %s. Price: %s\n",bmw.getName(), bmw.getSpecs(), bmw.getPrice());
        bmw = new SeatCoverDecorator(bmw);
        System.out.printf("Seat decorator added. Specs for %s are: %s. Price: %s\n",bmw.getName(), bmw.getSpecs(), bmw.getPrice());
        bmw = new MusicSystemDecorator(bmw);
        System.out.printf("Music System decorator added. Specs for %s are: %s. Price: %s\n",bmw.getName(), bmw.getSpecs(), bmw.getPrice());
    }


}
