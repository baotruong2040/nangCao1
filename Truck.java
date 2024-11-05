public class Truck extends AVehicle {
    double fuel = 0;//(L)
    double duongDi;//(km)
    double weight = 2;//(ton)
    double tien;//(vnd)
    public Truck( String name, double baseMaintenanceCost , double weight, double fuel,int mileage) {
        super(name, baseMaintenanceCost, mileage);
        this.weight = weight;
        this.fuel = fuel;
    }
    public Truck( String name, double baseMaintenanceCost, double weight, double fuel) {
        super(name, baseMaintenanceCost);
        this.weight = weight;
        this.fuel = fuel;
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }
    @Override
    public double calculateFuelCost() {
    
        if (weight>=1 && weight <= 3.5) {
            tien = (duongDi/11)*20000.0;
        }else if (weight >3.5 && weight <= 7) {
            tien = (duongDi/9)*20000.0;
        }else if (weight > 7 && weight<=14) {
            tien = (duongDi/7)*20000.0;
        }else {
            tien = (duongDi/5)*20000.0;
        }
        return Math.round(tien);
    }
    @Override
    public double caculateMaintenaceCost(){
        return baseMaintenanceCost + this.calculateFuelCost()+ weight*0.05;
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
            duongDi = 0;
            System.out.println("Refueled!");
        }
    }
    @Override
    public void move(int distance) {
        if (distance<= (fuel - (weight -1)*0.05)*11) {
            mileage += distance;
            fuel -= distance / 11.0 +(weight -1)*0.05;
            duongDi += distance;
        }else {
            System.out.println("Not enough fuel!");
            System.out.println("Need to refuel!");
        }
    }
}
