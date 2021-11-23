package Transportation;

public class Train implements Drivable{
    @Override
    public int getCost() {
        return 400;
    }

    @Override
    public String getVehicleName() {
        return "Train";
    }
}
