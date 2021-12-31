import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static ArrayList<Object> systemObjects = new ArrayList<Object>(); // Data structure with all the System Objects
    public static HashMap<Child, Integer> children_and_amount_to_pay = new HashMap<>();
    public static CreditCardCompany creditCardCompany = new CreditCardCompany();

    private static int child_id = 0;
    private static int child_password = 111;
    private static Guardian guardian = new Guardian();


    public static String getInputString()
    {

        while(true)
        {
            Scanner myObj = new Scanner(System.in);
            String in = myObj.nextLine();  // Read user input
            if(in != null)
            {
                if (in.length() != 0)
                {
                    return in;
                }
                System.out.println("Wrong input! you should insert a String input");
                continue;
            }
            System.out.println("Wrong input! you should insert a String input");
            continue;
        }

    }


    public static int getInputInt()
    {
        while(true)
        {
            Scanner myObj = new Scanner(System.in);
            String in = myObj.nextLine();  // Read user input
            if(in != null)
            {
                if (in.length() != 0)
                {
                    try {
                        return Integer.parseInt(in);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Wrong input! you should insert an int input");
                        continue;
                    }
                }
                System.out.println("Wrong input! you should insert an int input");
                continue;
            }
            System.out.println("Wrong input! you should insert an int input");
        }

    }


    public static String getInputDate()
    {
        while(true)
        {
            Scanner myObj = new Scanner(System.in);
            String in = myObj.nextLine();  // Read user input
            if(in != null)
            {
                if (in.length() != 5)
                {
                    try {
                        int intInput = Integer.parseInt(in);
                        String month = "";
                        String year = "";
                        for(int i = 0; i < in.length(); i++)
                        {
                            if(i < 2)
                            {
                                month += in.charAt(i);
                            }
                            else
                            {
                                year += in.charAt(i);
                            }
                        }
                        if((Integer.parseInt(month) > 12) || ((Integer.parseInt(year) > 2022)))
                        {
                            System.out.println("Wrong input! you should insert an date input");
                            continue;
                        }

                        return in;
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Wrong input! you should insert an date input");
                        continue;
                    }
                }
                System.out.println("Wrong input! you should insert an date input");
                continue;
            }
            System.out.println("Wrong input! you should insert an date input");
            continue;
        }
    }



    public static void main(String[] args)
    {
        Park park = new Park();

        ExtremeDevices MambaRide = new ExtremeDevices("MambaRide", 12, 1.4);
        Devices GiantWheel = new Devices("GiantWheel", 0, 0);
        Devices Carrousel = new Devices("Carrousel", 8, 0);
        park.add_device(MambaRide, 10);
        park.add_device(GiantWheel, 7);
        park.add_device(Carrousel, 5);


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
        String child_name;
        int child_height;
        int child_weight;
        String credit_card_num;
        String expiration_date;
        int max_amount;


        System.out.println("Please enter the child's name?");
        child_name = getInputString();

        System.out.println("Please enter the child's age?");
        child_age = getInputInt();

        Child new_child = new Child(guardian, child_name, child_age);


        System.out.println("Please enter credit card number?");
        credit_card_num = getInputString();
        guardian.setCreditCard(credit_card_num);

        System.out.println("Please enter card expiration date? (MM/YYYY)");
        expiration_date = getInputDate();
        guardian.setExpiration_date(expiration_date);


        System.out.println("Waiting for credit card company approval...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String approval = creditCardCompany.get_approval(guardian.getCreditCard(), guardian.getExpiration_date());
        System.out.println(approval);

        System.out.println("Please enter a maximum amount to charge?");
        max_amount = getInputInt();
        new_child.setMax_amount(max_amount);

        new_child.setId(child_id);
        children_and_amount_to_pay.put(new_child, 0);
        child_id++;
        child_password++;

        ETicket eTicket = new ETicket(new_child, new_child.getId(), new_child.getAge(), child_password);

        new_child.seteTicket(eTicket);
        guardian.add_child(new_child, eTicket);


        System.out.println("Please enter the child's height?");
        child_height = getInputInt();

        System.out.println("Please enter the child's weight?");
        child_weight = getInputInt();

        eTicket.setHeight(child_height);
        eTicket.setWeight(child_weight);


        /* - asks for child's details
        - asks for credit card details + hagbalat shum le hiuv
        - creates a child and print his login details (id + password) + write it in maagar mishtamshim
        - create for the child an eticket
        - create for the guardian a payment account per child (account is in eticket)


        */


    }

    private static void ManageTicket()
    {
        System.out.println("Please enter the child's id?");
        int child_Id = getInputInt();
        Child currChild = guardian.getChild(child_Id);
        if (currChild == null)
        {
            System.out.println("There is no child with id: " + child_Id + " in the System");
            return;
        }

        System.out.println("Verifying the child password from your eTicket.. may take couple of seconds..");
        try
        {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        currChild.showAllInfo();


        boolean menuFlag = true;

        while(menuFlag)
        {
            System.out.println("Please choose an option:");
            System.out.println("1. add rides");
            System.out.println("2. remove ride");
            System.out.println("3. back to main menu");

            int choice = getInputInt();
            switch (choice)
            {
                case 1:
                    AddRide();
                    break;
                case 2:
                    RemoveRide();
                    break;
                case 3:
                    menuFlag = false;
                    break;

                default:
                {
                    System.out.println("You inserted a wrong number");
                    continue;
                }
            }

        }


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

        for(Child child : children_and_amount_to_pay.keySet())
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
                        child.setRegisted(false);
                        child.setOwnETicket(false);
                        double totalPay = eTicket.getTotalPay();
                        int creditCardNumber = eTicket.getCreditCardNumber();
                        creditCardCompany.chargeCard(creditCardNumber, totalPay);
                        System.out.println("Your card has been charged for: " + totalPay + ".  Thank you and hope to see you in the future..");
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
