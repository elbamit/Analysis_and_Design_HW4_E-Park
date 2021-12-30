public class Child {
    private int id;
    private int age;
    private int height;
    private int weight;
    private Guardian guardian;
    private ETicket e_ticket;


    public Child(int id, int age, int height, int weight, Guardian guardian, ETicket e_ticket)
    {
        this.id = id;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.guardian = guardian;
        this.e_ticket = e_ticket;
    }
}
