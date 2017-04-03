package test;

import strategy.FlyNoWay;
import strategy.MuteQuack;

public class MinsonDuck extends Duck{
	
	public MinsonDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm Minson duck!");
	}
	
}
