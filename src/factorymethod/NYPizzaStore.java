package factorymethod;

public class NYPizzaStore extends PizzaStores{

	@Override
	protected Pizzas createPizza(String type) {
		// TODO Auto-generated method stub
		Pizzas pizzas = null;
		
		if (type == "Cheese") {
			pizzas = new NYStyleCheesePizza();
		} else { //������Դ����ܶ�ŦԼ��ζ�ĸ���pizza
			pizzas = null;
		}
		
		return pizzas;
	}

}
