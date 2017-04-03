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
		
		System.out.println("���ǻؼ�Ҫ���ź͵��ˣ�");
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		System.out.println("�������˾Ͱ��Ź��ϣ�");
		remoteControl.offButtonWasPushed(1);
		
		System.out.println("��Ҫ��ȥ��ˣ�");
		remoteControl.undoButtonWasPushed();
		
	}
}
