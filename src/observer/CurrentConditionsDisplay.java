package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void removeMe() {
		weatherData.removeObserver(this);
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentConditionsDisplay�¶��ǣ�" + temperature);
		System.out.println("CurrentConditionsDisplayʪ���ǣ�" + humidity);
		System.out.println("CurrentConditionsDisplay��ѹ�ǣ�" + pressure);
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
