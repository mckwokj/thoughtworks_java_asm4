package Transportation;

public class Plane implements Drivable{
    @Override
    public int getCost() {
        return 1000;
    }

    @Override
    public String getVehicleName() {
        return "Plane";
    }
}
