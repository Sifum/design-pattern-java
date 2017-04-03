package singleton;

public class Singleton {
	/**
	 * 利用双重检查加锁
	 * volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例时，
	 * 多个线程正确地处理uniqueInstance变量
	 */
	private volatile static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstane() {
		if (uniqueInstance == null) { //检查实例如果不存在就进入同步区
			synchronized (Singleton.class) { //进入区块后，再检查一次
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		return uniqueInstance;
	}
	
}
