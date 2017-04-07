package iterator;


public class DinnerMenu {
	static final int MAX_VALUE = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_VALUE];
	}
	
	public Iterator CreateIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	
	public void addMenuItem(MenuItem menuItem) {
		if (numberOfItems >= MAX_VALUE) {
			System.err.println("sorry, menu is full!");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
}
