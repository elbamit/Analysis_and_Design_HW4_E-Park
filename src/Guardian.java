import java.util.ArrayList;
import java.util.HashMap;

public class Guardian
{
    private String creditCard;
    private String expiration_date;
    private HashMap<Child, ETicket> list_of_children;



    public Guardian() {
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public ETicket returneTicket(Child child)
    {
        ETicket temp = list_of_children.get(child);
        this.list_of_children.remove(child);
        return temp;
    }

    public void add_child(Child child, ETicket eTicket)
    {
        this.list_of_children.put(child, eTicket);
    }

    public Child getChild(int id)
    {
        for(Child child : this.list_of_children.keySet())
        {
            if(child.idIsEqual(id))
                return child;
        }
        return null;
    }
}
