import Models.*;
import Services.PostOfficeService;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PostOfficeService service = new PostOfficeService();
        int choice1, choice2;

        do
        {
            System.out.println("\n=== Post Office Management System ===");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");
            choice1 = sc.nextInt();

            switch (choice1)
            {
                case 1:
                    do
                    {
                        System.out.println("\n--- Admin Menu ---");
                        System.out.println("1. Add Customer");
                        System.out.println("2. View Customers");
                        System.out.println("3. Remove Customer");
                        System.out.println("4. Show Postal Items");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        choice2 = sc.nextInt();
                        sc.nextLine();

                        switch (choice2)
                        {
                            case 1:
                                System.out.print("Enter customer name: ");
                                String name = sc.nextLine();
                                System.out.print("Enter address: ");
                                String address = sc.nextLine();
                                Customer c = service.addCustomer(name, address);
                                System.out.println("Customer Added Successfully");
                                break;
                            case 2:
                                service.showCustomers();
                                break;
                            case 3:
                                System.out.print("Enter the customer Name:");
                                String rname = sc.next();
                                service.removeCustomer(rname);
                                System.out.println("Customer Removed Successfully...");
                                break;
                            case 4:
                                service.showItems();
                                break;
                        }
                    } while (choice2 != 0);
                    break;

                case 2:
                    do
                    {
                        System.out.println("\n--- Customer Menu ---");
                        System.out.println("1. Send Letter");
                        System.out.println("2. Send Parcel");
                        System.out.println("3. Send Money Order");
                        System.out.println("0. Back");
                        System.out.print("Enter choice: ");
                        choice2 = sc.nextInt();

                        switch (choice2)
                        {
                            case 1:
                                System.out.print("Enter sender Name: ");
                                String sName = sc.next();
                                System.out.print("Enter receiver Name: ");
                                String rName = sc.next();
                                System.out.print("Enter weight (g): ");
                                double w = sc.nextDouble();
                                Customer sender = service.getCustomerByName(sName);
                                Customer receiver = service.getCustomerByName(rName);
                                if (sender != null && receiver != null)
                                    System.out.println("Letter Sent Successfully.");
                                else
                                    System.out.println("Invalid sender/receiver ID.");
                                break;

                            case 2:
                                System.out.print("Enter sender Name: ");
                                String psName = sc.next();
                                System.out.print("Enter receiver Name: ");
                                String prName = sc.next();
                                System.out.print("Enter weight (kg): ");
                                double pw = sc.nextDouble();
                                sc.nextLine();
                                System.out.print("Enter contents: ");
                                String contents = sc.nextLine();
                                Customer psender = service.getCustomerByName(psName);
                                Customer preceiver = service.getCustomerByName(prName);
                                if (psender != null && preceiver != null)
                                    System.out.println("Parcel Sent Successfully");
                                else
                                    System.out.println("Invalid sender/receiver ID.");
                                break;

                            case 3:
                                System.out.print("Enter sender Name: ");
                                String msName = sc.next();
                                System.out.print("Enter receiver Name: ");
                                String mrName = sc.next();
                                System.out.print("Enter amount: ");
                                double amount = sc.nextDouble();
                                Customer msender = service.getCustomerByName(msName);
                                Customer mreceiver = service.getCustomerByName(mrName);
                                if (msender != null && mreceiver != null)
                                    System.out.println("Money Order Sent Successfully");
                                else
                                    System.out.println("Invalid sender/receiver ID.");
                                break;
                        }
                    } while (choice2 != 0);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice1 != 0);
    }
}
