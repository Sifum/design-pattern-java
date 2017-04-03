package observer;

public class WeatherStation {
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(20, 80, 500);
		
		currentConditionsDisplay.removeMe();
		
		weatherData.setMeasurements(18, 50, 400);
		
	}
}
