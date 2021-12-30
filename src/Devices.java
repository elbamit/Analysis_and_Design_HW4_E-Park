public class Devices
{
    private Park park;
    private int minAge;
    private double minHeight;
    private double maxWeight;
    private boolean isOpen;
    private boolean isInorder;
    private double price;


    public Devices(Park park, int minAge, double minHeight, double maxWeight, boolean isOpen, boolean isInorder)
    {
        this.park = park;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.maxWeight = maxWeight;
        this.isOpen = isOpen;
        this.isInorder = isInorder;
    }
}
