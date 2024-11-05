public abstract class AVehicle implements Vehicle {
    String name;
    double baseMaintenanceCost;
    int mileage = 0;//km

    public AVehicle(String name, double baseMaintenanceCost) {
        this.name = name;
        this.baseMaintenanceCost = baseMaintenanceCost;
    }
    public AVehicle(String name, double baseMaintenanceCost, int mileage) {
        this.name = name;
        this.baseMaintenanceCost = baseMaintenanceCost;
        this.mileage = mileage;
    }
    @Override
    public void move(int distance) {
        mileage += distance;
    }
    public abstract double calculateFuelCost();
}
