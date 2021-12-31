import java.util.ArrayList;

public class Park
{
    private ParkSystem parkSystem;
    private ArrayList<Devices> devices;

    public Park()
    {

    }

    //Function that adds a device to the park's list of device
    public boolean add_device(Devices device, double price)
    {
        if (this.devices.contains(device))
        {
            return false;
        }

        else
        {
            device.setPrice(price);
            this.devices.add(device);
            return true;
        }
    }
}
