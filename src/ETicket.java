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


    public ETicket(Child child, HashMap<Devices, Integer> devicesEntry, int id, int age, int height, int weight, int creditCardNumber)
    {
        this.child = child;
        this.devicesEntry = devicesEntry;
        this.id = id;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.creditCardNumber =  creditCardNumber;

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
}
