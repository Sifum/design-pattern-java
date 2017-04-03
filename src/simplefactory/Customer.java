package simplefactory;

public class Customer {
	public static void main(String args[]) {
		String pizza = "CheesePizza";
		PizzaStore pizzaStore = new PizzaStore();
		
		Pizza p = pizzaStore.orderPizza("fdsf");
		if (p != null) {
			System.out.println("Here is your pizza");
		} else {
			System.out.println("Are you not hungery?");
		}
	}
}
