public class Truck extends Vehicle implements IDrivable{
    public final double TAX = .20;

    public Truck(int qty, double price, Engine engine, int speed, String name) {
        super(qty, price, engine, speed, name);
    }

    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    public void totalAfterTax(Vehicle vehicle){
        System.out.println(vehicle.getPrice() - vehicle.getPrice() * TAX);
    }

}
