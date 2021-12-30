import java.util.ArrayList;
import java.util.HashMap;

public class CreditCardCompany
{
    private ArrayList<ParkSystem> parkSystemArrayList;
    private HashMap<Guardian, CreditCard> guardians;

    public CreditCardCompany(ArrayList<ParkSystem> parkSystemArrayList, HashMap<Guardian, CreditCard> guardians)
    {
        this.parkSystemArrayList = new ArrayList<>();
        this.guardians = new HashMap<>();
    }
}
