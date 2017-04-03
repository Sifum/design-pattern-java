package factorymethod;


public abstract class PizzaStores {
	
	public Pizzas orderPizza(String type) {
		Pizzas pizzas = null;
		
		pizzas = createPizza(type);
		
		if (pizzas != null) {
			pizzas.prepare();
			pizzas.bake();
			pizzas.cut();
			pizzas.box();
		}
		return pizzas;
	}
	
	protected abstract Pizzas createPizza(String type);
	
}
