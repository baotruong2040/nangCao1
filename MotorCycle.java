public class MotorCycle extends AVehicle {
    double fuel = 0;//(L)
    double duongDi;//(km)
    public MotorCycle(String name, double baseMaintenanceCost, double fuel) {
        super(name, baseMaintenanceCost);
        this.fuel = fuel;
    }
    public MotorCycle(String name, double baseMaintenanceCost, double fuel, int mileage ) {
        super(name, baseMaintenanceCost, mileage);
        this.fuel = fuel;
    }
    public String getType(){
        return this.getClass().getSimpleName();
    }
    public double calculateFuelCost() {
        return (duongDi/15.0)*20000.0;
    }
    @Override
    public double caculateMaintenaceCost(){
        return baseMaintenanceCost + this.calculateFuelCost();
    }
    @Override
    public void displayInfo(){
        System.out.println("Type: "+getType()+", Name: "+ name+",Mileage: "+mileage);
    }
    @Override
    public void refuel(double ammout){
        if (ammout<=0) {
            System.out.println("cannot refuel!");
        }else{
            fuel += ammout/20000.0;
            duongDi =0;
            System.out.println("Refueled!");
        }
    }

    public void move(int distance) {
        if (distance<= fuel*15) {
            mileage += distance;
            fuel -= distance/15.0;
            duongDi += distance;
        }else {
            System.out.println("Not enough fuel!");
            System.out.println("Need to refuel!");
        }
    }
}
