package com.weather.station.project.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Temp: " + this.temperature + " - "  + "Humidity: " + this.humidity);

	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}		
	}

}
