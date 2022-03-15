package March_14_2022.OOPS;

interface Wheels{
    void set_no_of_wheels(int num);
    int get_no_of_wheels();
}
interface FuelType{
    String[] fuelType={"Petrol","Diesel","Electric"};
}

class Vehicle implements Wheels,FuelType{

    private int no_of_wheels;
    private String fuel_type;

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    @Override
    public void set_no_of_wheels(int num) {
        this.no_of_wheels=num;
    }

    @Override
    public int get_no_of_wheels() {
        return this.no_of_wheels;
    }


}

public class OOPS_Abstraction {
    public static void main(String[] args)
    {
        Vehicle Car = new Vehicle();
        Car.set_no_of_wheels(4);
        Car.setFuel_type(Vehicle.fuelType[2]);
        System.out.println("Car : "+Car.get_no_of_wheels()+" : "+Car.getFuel_type());

        Vehicle Bike = new Vehicle();
        Bike.set_no_of_wheels(2);
        Bike.setFuel_type(Vehicle.fuelType[0]);
        System.out.println ("Bike : "+Bike.get_no_of_wheels()+" : " +Bike.getFuel_type());
    }
}
