
public class LAB7_RUNNER {
	public static void main(String[] args) {
			Pizza p1 = new Pizza ("small", 1,2,3);
	        Pizza p2 = new Pizza ("medium", 3,2,1);
	        Pizza p3 = new Pizza ("large", 2,3,1);
	        
	        PizzaOrder order1 = new PizzaOrder();
			order1.setNumPizzas(2);
			order1.setPizza1(p1);
			order1.setPizza2(p2);
			order1.setPizza3(p3);
			double total1 = order1.calcTotal();
			
			order1.getPizza1().getDescription();
			order1.getPizza2().getDescription();
			System.out.println("Total cost1: $" + total1);


	}
}
