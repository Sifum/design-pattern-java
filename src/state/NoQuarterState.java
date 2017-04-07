package state;

public class NoQuarterState implements State{
	
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		//如果有人投了钱，就需要改变机器的状态
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there's no quarter");
	}
	

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

}
