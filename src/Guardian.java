import java.util.ArrayList;
import java.util.HashMap;

public class Guardian
{
    private int id_guard;
    private ParkSystem parkSystem;
    private String creditCard;
    private HashMap<Child, ETicket> list_of_children;






    public Guardian(int id_guard, ArrayList<Child> list_of_children, ParkSystem parkSystem, String creditCard)
    {
        this.id_guard = id_guard;
        this.parkSystem = parkSystem;
        this.creditCard = creditCard;
        this.list_of_children = new HashMap<>();

    }

    public ETicket returneTicket(Child child)
    {
        ETicket temp = list_of_children.get(child);
        this.list_of_children.remove(child);
        return temp;
    }
}
