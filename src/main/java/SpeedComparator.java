import java.util.Comparator;

public class SpeedComparator implements Comparator <IDrivable> {


    @Override
    public int compare(IDrivable drivable1, IDrivable drivable2) {
        if (drivable1.milesPerHour() > drivable2.milesPerHour()) {
            return 1;
        }
        return -1;
    }

}