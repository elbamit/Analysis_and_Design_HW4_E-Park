import java.util.ArrayList;
import java.util.HashMap;

public class Guardian
{
    private int id_guard;
    private String creditCard;
    private HashMap<Child, ETicket> list_of_children;



    public Guardian() {
        this.id_guard = 1;
        this.creditCard = "12345";
    }

    public ETicket returneTicket(Child child)
    {
        ETicket temp = list_of_children.get(child);
        this.list_of_children.remove(child);
        return temp;
    }
}
