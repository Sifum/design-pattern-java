package commandSlot;

public class DoorCloseCommand implements Command{
	Door door;
	
	public DoorCloseCommand(Door door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.close();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		door.open();
	}
	
}
