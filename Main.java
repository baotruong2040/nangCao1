import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AVehicle b1 = new Bicycle("A1", 2);
        AVehicle t1 = new Truck("Optimus", 5000000, 3.0, 10);
        AVehicle m1 = new MotorCycle("CBR150", 500000, 10);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(m1);
        vehicles.add(t1);
        vehicles.add(b1);

        for (Vehicle vehicle : vehicles) {
            vehicle.move(10);
            vehicle.displayInfo();
            vehicle.refuel(20000);
            
        }

    }
}
