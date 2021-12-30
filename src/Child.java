public class Child {

    private int id;
    private Guardian guardian;
    private boolean owneETicket = false;
    private boolean isRegisted;



    public Child(Guardian guardian)
    {

        this.guardian = guardian;
        this.isRegisted = false;
    }

    public boolean idIsEqual(int id)
    {
        if(this.id == id)
            return true;
        return false;
    }

    public boolean hasEticket()
    {
        return this.owneETicket;
    }

    public Guardian getGuardian()
    {
        return this.guardian;
    }
}
