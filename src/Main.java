import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
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
                case "1": // Register child

                    break;

                case "2": // Manage ticket

                    break;

                case "3": // Add ride

                    break;

                case "4": // Remove ride

                    break;

                case "5": // Exit park

                    break;

                case "6": // Exit

                    rynSystem = false;
                    break;


            }
        }
        System.out.println("gg and thank you");
    }
}
