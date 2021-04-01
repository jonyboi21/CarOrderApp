public class Engine{

    private int numOfCylinders;

    public Engine(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numOfCylinders=" + numOfCylinders +
                '}';
    }
//
//    public Engine(int qty, double price, Engine engine, int speed, double tax, String name) {
//        super(qty, price, engine, speed, tax, name);
//    }
//
//
//    @Override
//    public void totalAfterTax(Vehicle vehicle) {
//
//    }
}
