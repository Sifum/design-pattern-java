package simplefactory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type == "CheesePizza") {
			pizza = new CheesePizza();
		} else if (type == "VegglePizza") {
			pizza = new VegglePizza();
		}
		return pizza;
	}
}
