package iterator;


public class Waitress {
	DinnerMenu dinnerMenu;
	
	public Waitress(DinnerMenu dinnerMenu) {
		// TODO Auto-generated constructor stub
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator dinnerIterator = dinnerMenu.CreateIterator();
		System.out.println("Menu\n ---\nLUNCH");
		printMenu(dinnerIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + ", ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
