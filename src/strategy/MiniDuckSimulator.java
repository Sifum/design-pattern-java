package strategy;

public class MiniDuckSimulator {
	public static void main(String arg[]) {
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
