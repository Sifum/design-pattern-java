package factorymethod;

public class ChicagoPizzaStore extends PizzaStores{

	@Override
	protected Pizzas createPizza(String type) {
		// TODO Auto-generated method stub
		Pizzas pizzas = null;
		
		if (type == "Cheese") {
			pizzas = new ChicagoStyleCheesePizza();
		} else { //这里可以创建很多芝加哥风味的各种pizza
			pizzas = null;
		}
		
		return pizzas;
	}

}
