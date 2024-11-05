public class Bicycle extends AVehicle {
    
    public Bicycle(String name, double baseMaintenanceCost) {
        super(name, baseMaintenanceCost);
    }
    @Override
    public String getType(){
        return this.getClass().getSimpleName();
    }
    @Override
    public double caculateMaintenaceCost(){
        return super.baseMaintenanceCost + 50;
    }
    @Override
    public void displayInfo(){
        System.out.println("Type: "+getType()+", Name: "+ name+",Mileage: "+mileage);
    }
    @Override
    public void refuel(double ammout){
        System.out.println("no need refuel");
    }
    @Override
    public double calculateFuelCost() {
        return 0;
    }
}
