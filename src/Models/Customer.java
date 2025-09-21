package Models;

public class Customer
{
    private String name, address;
    private int id;

    public Customer(int id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    @Override
    public String toString()
    {
        return "Customer ID : " + id + "\nName : " + name + "\nAddress : " + address;
    }

}
