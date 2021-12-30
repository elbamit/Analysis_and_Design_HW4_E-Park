import java.util.ArrayList;
import java.util.HashMap;

public class ParkSystem
{
    private HashMap<String, String> login_details;
    private ArrayList<Guardian> list_of_guardians;
    private Park park;

    public ParkSystem(HashMap<String, String> login_details, ArrayList<Guardian> list_of_guardians, Park park) {
        this.login_details = login_details;
        this.list_of_guardians = list_of_guardians;
        this.park = park;
    }
}
