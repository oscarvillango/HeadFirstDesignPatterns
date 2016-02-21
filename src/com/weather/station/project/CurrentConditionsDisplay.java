package com.weather.station.project;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registrerObserver(this);
	}
	
	public void display() {
		System.out.println("Temp: " + this.temperature + "Humidity: " + this.humidity);

	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

}
