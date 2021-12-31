import java.util.ArrayList;
import java.util.HashMap;

public class ETicket
{
    Child child;
    HashMap<Devices, Integer> devicesEntry;
    private int id;
    private int age;
    private int height;
    private int weight;
    private double totalPay;
    private int creditCardNumber;


    public ETicket(Child child, int id, int age)
    {
        this.child = child;
        this.id = id;
        this.age = age;
    }

    public void addEntry(Devices devices, int numberOfEntry, boolean acceptance) // Acceptance for extreme Devices we need a permission from the Guardian
    {
        return;
    }

    public void removeEntry(Devices devices)
    {
        return;
    }

    public double getTotalPay()
    {
        return this.totalPay;
    }

    public int getCreditCardNumber()
    {
        return creditCardNumber;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
