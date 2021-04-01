abstract public class Vehicle extends Product {
    private int qty;
    private double price;
    private Engine engine;
    private int speed;
    final private double TAX = .15;

    public Vehicle(int qty, double price, Engine engine, int speed, String name) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public double getTAX() {
        return TAX;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void totalAfterTax(Vehicle vehicle);


    public double totalBeforeTax(Vehicle vehicle){
       return vehicle.getPrice();
    }
    public double calcTax(Vehicle vehicle){
        return vehicle.getPrice() * getTAX();
    }

    @Override
    public String toString() {
        return
                "speed = " + speed;

    }
}
