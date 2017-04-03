package test;

import strategy.FlyWithWings;
import strategy.Squeak;

public class Test {
	public static void main(String args[]) {
		FlyWithWings flyWithWings = new FlyWithWings();
		Squeak squeak = new Squeak();
		MinsonDuck minsonDuck = new MinsonDuck();
		minsonDuck.display();
		minsonDuck.performFly();
		minsonDuck.performQuack();
		
		minsonDuck.setFlyBehavior(flyWithWings);
		minsonDuck.setQuackBehavior(squeak);
		
		minsonDuck.performFly();
		minsonDuck.performQuack();
	}
}
