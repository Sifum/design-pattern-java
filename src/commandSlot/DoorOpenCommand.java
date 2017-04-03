package commandSlot;

public class DoorOpenCommand implements Command{
	Door door;
	
	public DoorOpenCommand(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		door.close();
	}

}
