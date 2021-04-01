public class Car extends Vehicle implements IDrivable{


    public Car(int qty, double price, Engine engine, int speed, String name) {
        super(qty, price, engine, speed, name);
    }


    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.getPrice() - vehicle.getPrice() * vehicle.getTAX());
    }


    @Override
    public int milesPerHour() {
        return getSpeed();
    }
}
