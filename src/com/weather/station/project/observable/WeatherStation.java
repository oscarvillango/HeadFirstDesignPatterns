package com.weather.station.project.observable;

public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay deviceOne = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay deviceTwo = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay deviceThree = new ForecastDisplay(weatherData);
		
		try {
			weatherData.setMeasurements(30.2f, 60, 30.4f);
			Thread.sleep(3000);
			weatherData.setMeasurements(40.2f, 40, 30.9f);
			Thread.sleep(3000);
			weatherData.setMeasurements(10.2f, 90, 30.4f);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
