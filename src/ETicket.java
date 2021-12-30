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


    public ETicket(Child child, HashMap<Devices, Integer> devicesEntry, int id, int age, int height, int weight)
    {
        this.child = child;
        this.devicesEntry = devicesEntry;
        this.id = id;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
}
