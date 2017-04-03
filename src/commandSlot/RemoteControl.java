package commandSlot;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[2];
		offCommands = new Command[2];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 2; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n---- Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
		}
		
		return stringBuffer.toString();
	}
	
}
