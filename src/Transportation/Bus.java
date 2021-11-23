package Transportation;

public class Bus implements Drivable{
    @Override
    public int getCost() {
        return 300;
    }

    @Override
    public String getVehicleName() {
        return "Bus";
    }
}
