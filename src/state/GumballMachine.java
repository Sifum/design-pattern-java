package state;

public class GumballMachine {
	State noQuarterState;
	State soldOutState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumbals) {
		// TODO Auto-generated constructor stub
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		if (numberGumbals > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	int getCount() {
		return count;
	}
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count -1;
		}
	}
	
	
	void setState(State state) {
		this.state = state;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getSoldState()  {
		return soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
}
