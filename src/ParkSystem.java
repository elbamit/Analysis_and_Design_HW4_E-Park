import java.util.ArrayList;
import java.util.HashMap;

public class ParkSystem
{
    private HashMap<String, String> login_details;
    private ArrayList<Guardian> list_of_guardians;
    private Park park;

    public ParkSystem(Park park) {
        this.park = park;
    }
}
