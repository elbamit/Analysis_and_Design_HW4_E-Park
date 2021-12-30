import java.util.ArrayList;

public class Park
{
    private ParkSystem parkSystem;
    private ArrayList<Devices> devices;

    public Park(ParkSystem parkSystem, ArrayList<Devices> devices)
    {
        this.parkSystem = parkSystem;
        this.devices = devices;
    }
}
