package Services;

import Models.*;
import java.util.ArrayList;
import java.util.List;

public class PostOfficeService
{
    private List<Customer> customers = new ArrayList<>();
    private List<PostalItem> items = new ArrayList<>();
    private int customerIdCounter = 1;
    private int itemIdCounter = 1;

    public Customer addCustomer(String name, String address)
    {
        Customer c = new Customer(customerIdCounter++, name, address);
        customers.add(c);
        return c;
    }

    public void removeCustomer(String name)
    {
        for (int i = 0; i < customers.size(); i++)
        {
            if (customers.get(i).getName().equals(name)) customers.remove(i);
        }
    }

    public Customer getCustomerByName(String name)
    {
        for (Customer c : customers)
            if (c.getName().equals(name)) return c;
        return null;
    }

    public PostalItem addLetter(Customer sender, Customer receiver, double weight)
    {
        double cost = weight * 2;
        Letter letter = new Letter(itemIdCounter++, sender, receiver, cost, weight);
        items.add(letter);
        return letter;
    }

    public PostalItem addParcel(Customer sender, Customer receiver, double weight, String contents)
    {
        double cost = weight * 5;
        Parcel parcel = new Parcel(itemIdCounter++, sender, receiver, cost, weight, contents);
        items.add(parcel);
        return parcel;
    }

    public PostalItem addMoneyOrder(Customer sender, Customer receiver, double amount)
    {
        double cost = amount * 0.02;
        MoneyOrder mo = new MoneyOrder(itemIdCounter++, sender, receiver, cost, amount);
        items.add(mo);
        return mo;
    }

    public void showCustomers()
    {
        if (customers.isEmpty())
        {
            System.out.println("No customers found.");
            return;
        }

        System.out.printf("%-8s %-20s %-30s%n", "CustID", "Name", "Address");
        System.out.println("-----------------------------------------------------");

        for (Customer c : customers)
        {
            System.out.printf("%-8d %-20s %-30s%n",
                    c.getId(), c.getName(), c.getAddress());
        }
    }

    public void showItems()
    {
        if (items.isEmpty())
        {
            System.out.println("No postal items found.");
            return;
        }

        System.out.printf("%-8s %-12s %-10s %-15s %-15s %-20s%n",
                "ItemID", "Type", "Cost", "Sender", "Receiver", "Extra Info");
        System.out.println("----------------------------------------------------------------------");

        for (PostalItem p : items)
        {
            String extraInfo = "";
            if (p instanceof Letter)
                extraInfo = "Weight: " + ((Letter)p).getWeight() + " g";
            else if (p instanceof Parcel)
                extraInfo = "Weight: " + ((Parcel)p).getWeight() + " kg, Contents: " + ((Parcel)p).getContents();
            else if (p instanceof MoneyOrder)
                extraInfo = "Amount: " + ((MoneyOrder)p).getAmount();

            System.out.printf("%-8d %-12s %-10.2f %-15s %-15s %-20s%n",
                    p.getItemId(), p.getType(), p.getCost(),
                    p.getSender().getName(), p.getReceiver().getName(), extraInfo);
        }
    }

}
