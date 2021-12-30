import java.util.ArrayList;

public class Guardian
{
    private int id_guard;
    private ArrayList <Child> list_of_children;
    private ParkSystem parkSystem;
    private String creditCard;
    private double purchaseAccount;




    public Guardian(int id_guard, ArrayList<Child> list_of_children, ParkSystem parkSystem, String creditCard)
    {
        this.id_guard = id_guard;
        this.list_of_children = list_of_children;
        this.parkSystem = parkSystem;
        this.creditCard = creditCard;
    }
}
