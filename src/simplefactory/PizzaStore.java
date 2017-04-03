package simplefactory;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore() {
		this.factory = new SimplePizzaFactory();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		
		if (pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}

		
		return pizza;
	}
	
}
