import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Object> systemObjects = new ArrayList<Object>(); // Data structure with all the System Objects
    public static ArrayList<Child> children = new ArrayList<>();
    public static CreditCardCompany creditCardCompany = new CreditCardCompany();


    public static void main(String[] args)
    {
        Park park = new Park();

        ExtremeDevices MambaRide = new ExtremeDevices("MambaRide", 12, 1.4);
        Devices GiantWheel = new Devices("GiantWheel", 0, 0);
        Devices Carrousel = new Devices("Carrousel", 8, 0);
        park.add_device(MambaRide, 10);
        park.add_device(GiantWheel, 7);
        park.add_device(Carrousel, 5);

        Guardian guardian = new Guardian();

        systemObjects.add(park);
        systemObjects.add(guardian);
        systemObjects.add(MambaRide);
        systemObjects.add(GiantWheel);
        systemObjects.add(Carrousel);
        systemObjects.add(creditCardCompany);

        boolean runSystem = true;

        while(runSystem)
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

                        runSystem = false;
            }
        }
        System.out.println("gg and ByeBye");
    }



    private static void RegisterChild()
    {
        int child_age;
        int child_height;
        int child_weight;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the child's age?");
        String in = myObj.nextLine();  // Read user input
        child_age = Integer.parseInt(in);

        System.out.println("Please enter the child's height?");
        in = myObj.nextLine();  // Read user input
        child_height = Integer.parseInt(in);

        System.out.println("Please enter the child's weight?");
        in = myObj.nextLine();  // Read user input
        child_weight = Integer.parseInt(in);

//        Child new_child = new Child()

        /* - asks for child's details
        - asks for credit card details + hagbalat shum le hiuv
        - creates a child and print his login details (id + password) + write it in maagar mishtamshim
        - create for the child an eticket
        - create for the guardian a payment account per child (account is in eticket)


        */


    }

    private static void ManageTicket()
    {
        /*
        - asks for child id + password of child
        - shows all the entries the child has + current payment ammount
        - opens a sub-menu to choose between: add rides/ remove rides/ no action
        -


         */


    }

    private static void AddRide()
    {
        /*
        - asks for child id
        - shows all the allowed devices for the child
        - user chooses the device and ammount of entries - updates the eticket
        - if extreme device - asks the user for a second permission
        - update the payment account

         */


    }

    private static void RemoveRide()
    {
    /*
        - asks for child id
        - shows all entries of the child
        - user chooses the device and ammount of entries to remove - updates the eticket
        - update the payment account

         */

    }

    private static void ExitPark()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the id of the Child who want to Exit?");
        String in = myObj.nextLine();  // Read user input

        int id = Integer.parseInt(in);

        for(Child child : children)
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
                        int creditCardNumber = eTicket.getCreditCardNumber();
                        creditCardCompany.chargeCard(creditCardNumber, totalPay);
                        System.out.println("Your card has been charged for: " + totalPay + ".  Thnk you and hope to see you in the future..");
                    }
                    else
                        return;
                }
                System.out.println("The child doesn't have an eTicket..");
                return;
            }
            System.out.println("The child was not found.. you inserted a wrong id number");
            return;


        }

    }

}
