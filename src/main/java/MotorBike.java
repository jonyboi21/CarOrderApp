public class MotorBike extends Vehicle {
    private int numOfWheels;

    public MotorBike(int qty, double price, Engine engine, int speed, String name) {
        super(qty, price, engine, speed, name);
    }


    public void totalAfterTax(Vehicle vehicle){
    System.out.println(vehicle.getPrice() - vehicle.getPrice() * vehicle.getTAX());
}
}
