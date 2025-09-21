package Models;

public class MoneyOrder extends PostalItem
{
    private double amount;

    public MoneyOrder(int itemId, Customer sender, Customer receiver, double cost, double amount)
    {
        super(itemId, sender, receiver, cost);
        this.amount = amount;
    }

    @Override
    public String getType()
    {
        return "Money Order";
    }

    public double getAmount()
    {
        return amount;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n Amount: " + amount;
    }
}
