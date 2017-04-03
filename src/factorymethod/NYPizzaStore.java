package factorymethod;

public class NYPizzaStore extends PizzaStores{

	@Override
	protected Pizzas createPizza(String type) {
		// TODO Auto-generated method stub
		Pizzas pizzas = null;
		
		if (type == "Cheese") {
			pizzas = new NYStyleCheesePizza();
		} else { //这里可以创建很多纽约风味的各种pizza
			pizzas = null;
		}
		
		return pizzas;
	}

}
