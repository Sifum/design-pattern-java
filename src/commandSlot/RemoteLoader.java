package commandSlot;

public class RemoteLoader {
	public static void main(String args[]) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		Door door = new Door();
		DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
		DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
		
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, doorOpenCommand, doorCloseCommand);
		
		System.out.println(remoteControl);
		
		System.out.println("我们回家要开门和灯了：");
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		System.out.println("进家里了就把门关上：");
		remoteControl.offButtonWasPushed(1);
		
		System.out.println("我要出去买菜：");
		remoteControl.undoButtonWasPushed();
		
	}
}
