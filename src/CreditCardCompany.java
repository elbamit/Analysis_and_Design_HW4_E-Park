import java.util.ArrayList;
import java.util.HashMap;

public class CreditCardCompany
{
    private ArrayList<ParkSystem> parkSystemArrayList;
    private HashMap<Guardian, String> guardians;

    public CreditCardCompany()
    {
        this.parkSystemArrayList = new ArrayList<>();
        this.guardians = new HashMap<>();
    }
}
