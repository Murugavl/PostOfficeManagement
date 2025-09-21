package Models;

public abstract class PostalItem
{
    protected int itemId;
    protected Customer sender;
    protected Customer receiver;
    protected double cost;

    public PostalItem(int itemId, Customer sender, Customer receiver, double cost) {
        this.itemId = itemId;
        this.sender = sender;
        this.receiver = receiver;
        this.cost = cost;
    }

    public abstract String getType();

    public int getItemId()
    {
        return itemId;
    }
    public Customer getSender()
    {
        return sender;
    }
    public Customer getReceiver()
    {
        return receiver;
    }
    public double getCost()
    {
        return cost;
    }

    @Override
    public String toString()
    {
        return "ItemID: " + itemId + "\n Type: " + getType() +
                "\n Cost: " + cost + "\n Sender: " + sender.getName() +
                "\n Receiver: " + receiver.getName();
    }
}
