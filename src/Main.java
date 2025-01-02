import model.VehicleComponent;
import model.impl.BackDoor;
import model.impl.SideDoor;
import model.impl.VehicleDoor;

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
    }


}
