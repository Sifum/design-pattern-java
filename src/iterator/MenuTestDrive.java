package iterator;

public class MenuTestDrive {
	public static void main(String args[]) {
		
		MenuItem menuItem1 = new MenuItem("Vegetarian", "Bacon with lettuce & tomoto on whole wheat", true, 2.99);
		MenuItem menuItem2 = new MenuItem("BLT", "A hot dog", false, 3.29);
		
		DinnerMenu dinnerMenu = new DinnerMenu();
		dinnerMenu.addMenuItem(menuItem1);
		dinnerMenu.addMenuItem(menuItem2);
		
		Waitress waitress = new Waitress(dinnerMenu);
		
		waitress.printMenu();
		
	}
}
