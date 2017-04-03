package singleton;

public class Singleton {
	/**
	 * ����˫�ؼ�����
	 * volatile�ؼ���ȷ������uniqueInstance��������ʼ����Singletonʵ��ʱ��
	 * ����߳���ȷ�ش���uniqueInstance����
	 */
	private volatile static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstane() {
		if (uniqueInstance == null) { //���ʵ����������ھͽ���ͬ����
			synchronized (Singleton.class) { //����������ټ��һ��
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		return uniqueInstance;
	}
	
}
