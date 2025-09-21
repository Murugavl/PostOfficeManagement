package Models;

public class Letter extends PostalItem
{
    private double weight;

    public Letter(int itemId, Customer sender, Customer receiver, double cost, double weight)
    {
        super(itemId, sender, receiver, cost);
        this.weight = weight;
    }

    @Override
    public String getType()
    {
        return "Letter";
    }
    public double getWeight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n Weight: " + weight + "g";
    }
}
