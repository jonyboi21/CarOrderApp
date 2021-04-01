import java.util.ArrayList;
import java.util.Collections;

public class VehicleApp {
    public static void printVehicleNameAndPrices(Vehicle[] vehicles){
        for (int i=0;i< vehicles.length; i++){
            System.out.println(vehicles[i].getName());
            System.out.println(" : " + vehicles[i].getPrice());
        }
    }
    public static void getSpeedOfDrivableVehicles(ArrayList<IDrivable> driveable){
        for(int i=0; i< driveable.size(); i++){
            System.out.println(driveable.get(i).milesPerHour());
        }
    }
    public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<IDrivable> driveable){
        Collections.sort(driveable, new SpeedComparator());
    for(IDrivable d: driveable){
        System.out.println(d);
    }

    }

    public static void main(String[] args) {
        Engine carEngine = new Engine(4);
        Engine truckEngine = new Engine(6);
        Engine bikeEngine = new Engine(1);

        Car car = new Car(1,50,carEngine,100,"Honda");
        Truck truck = new Truck(1,100,truckEngine,75,"GM");
        MotorBike bike = new MotorBike(1,75,bikeEngine,45,"Suzuki");

        Vehicle[] arrayOfVehicles = {car, truck, bike};
        printVehicleNameAndPrices(arrayOfVehicles);

        ArrayList<IDrivable> drivableArrayList = new ArrayList<>();
        drivableArrayList.add(car);
        drivableArrayList.add(truck);

        getSpeedOfDrivableVehicles(drivableArrayList);


        System.out.println(car.totalBeforeTax(car));

        car.totalAfterTax(car);

        System.out.println(truck.totalBeforeTax(truck));
        truck.totalAfterTax(truck);

        sortAndPrintDrivableVehiclesBySpeed(drivableArrayList);




    }



}
