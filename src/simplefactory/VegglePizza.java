package simplefactory;

public class VegglePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza is preparing...");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza is baking...");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza is cuting...");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("CheesePizza is boxing...");
	}

}
