package decorator;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "House Blend coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
