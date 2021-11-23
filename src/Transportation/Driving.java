package Transportation;

public class Driving implements Drivable{
    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public String getVehicleName() {
        return "Driving";
    }
}
