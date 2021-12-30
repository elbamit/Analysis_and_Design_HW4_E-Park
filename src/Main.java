import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static ArrayList<Object> systemObjects = new ArrayList<Object>(); // Data structure with all the System Objects
    public static ArrayList<Child> childs = new ArrayList<>();


    public static void main(String[] args)
    {


        ArrayList<Child> childs = new ArrayList<>();
        ExtremeDevices MambaRide = new ExtremeDevices("MambaRide", 12, 1.4);
        Devices GiantWheel = new Devices("GiantWheel", 0, 0);
        Devices Carrousel = new Devices("Carrousel", 8, 0);

        systemObjects.add(MambaRide);
        systemObjects.add(GiantWheel);
        systemObjects.add(Carrousel);

        boolean rynSystem = true;

        while(rynSystem)
        {
            System.out.println("Welcome to ePark !");
            System.out.println("1.   Register child");
            System.out.println("2.   Manage ticket");
            System.out.println("3.   Add ride");
            System.out.println("4.   Remove ride");
            System.out.println("5.   Exit park");
            System.out.println("6.   Exit");

            Scanner myObj = new Scanner(System.in);
            String in = myObj.nextLine();  // Read user input


            switch (in)  // SwitchCase on the user input
            {
                case "1" -> // Register child
                        RegisterChild();

                case "2" -> // Manage ticket
                        ManageTicket();

                case "3" -> // Add ride
                        AddRide();

                case "4" -> // Remove ride
                        RemoveRide();

                case "5" -> // Exit park
                        ExitPark();

                case "6" -> // Exit

                        rynSystem = false;
            }
        }
        System.out.println("gg and ByeBye");
    }



    private static void RegisterChild()
    {


    }

    private static void ManageTicket()
    {


    }

    private static void AddRide()
    {


    }

    private static void RemoveRide()
    {


    }

    private static void ExitPark()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the id of the Child who want to Exit?");
        String in = myObj.nextLine();  // Read user input

        int id = Integer.parseInt(in);

        for(Child child : childs)
        {
            if(child.idIsEqual(id)) // check if the specific child is in the system
            {
                if(child.hasEticket())
                {
                    System.out.println("Please return your eTicket:\n1. ok\n2. I don't want to!");
                    in = myObj.nextLine();  // Read user input
                    if(in.equals("1"))
                    {
                        ETicket eTicket = child.getGuardian().returneTicket(child);
                        double totalPay = eTicket.getTotalPay();
                    }
                }
                System.out.println("The child doesn't have an eTicket..");
                return;
            }
            System.out.println("The child was not found.. you inserted a wrong id number");
            return;


        }

    }

}
