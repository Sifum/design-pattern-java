package factorymethod;

public class ChicagoPizzaStore extends PizzaStores{

	@Override
	protected Pizzas createPizza(String type) {
		// TODO Auto-generated method stub
		Pizzas pizzas = null;
		
		if (type == "Cheese") {
			pizzas = new ChicagoStyleCheesePizza();
		} else { //������Դ����ܶ�֥�Ӹ��ζ�ĸ���pizza
			pizzas = null;
		}
		
		return pizzas;
	}

}
