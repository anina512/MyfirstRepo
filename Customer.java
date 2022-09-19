import java.util.ArrayList;

public class Customer 
{
	private ArrayList<Order> orders; 
	
	public Customer() 
	{
		this.orders = new ArrayList<>();
	}

	public void addOrders(Order orders) 
	{
		this.orders.add(orders);
	}	
	
	public ArrayList<Order> getOrders() 
	{
		return orders;
	}

	public double totalCost()
	{
		double totalCost = 0.0;
		
		for(Order order : this.orders)
		{
			totalCost += order.totalCost();
		}
		
		return totalCost;
	}
	
}
