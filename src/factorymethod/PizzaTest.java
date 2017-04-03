package factorymethod;

public class PizzaTest {
	public static void main(String args[]) {
		PizzaStores nyStores = new NYPizzaStore();
		PizzaStores chicagoStore = new ChicagoPizzaStore();
		
		nyStores.orderPizza("Cheese");
		
		System.out.println("\n\n\n\n");
		
		chicagoStore.orderPizza("Cheese");
	}
}
