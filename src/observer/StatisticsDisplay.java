package observer;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void removeMe() {
		// TODO Auto-generated method stub
		weatherData.removeObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplay�¶��ǣ�" + temperature);
		System.out.println("StatisticsDisplayʪ���ǣ�" + humidity);
		System.out.println("StatisticsDisplay��ѹ�ǣ�" + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
