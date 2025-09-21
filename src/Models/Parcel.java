package Models;

public class Parcel extends PostalItem
{
    private double weight;
    private String contents;

    public Parcel(int itemId, Customer sender, Customer receiver, double cost, double weight, String contents)
    {
        super(itemId, sender, receiver, cost);
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String getType()
    {
        return "Parcel";
    }

    public double getWeight()
    {
        return weight;
    }
    public String getContents()
    {
        return contents;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n Weight: " + weight + "kg, \n Contents: " + contents;
    }
}
