package com.weather.station.project.observable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;
	private float currentPresure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable obs) {
		this.observable = obs;
		this.observable.addObserver(this);
	}

	public void display() {
		System.out.println("Last pressure: " + this.lastPressure + " - " + "Pressure: " + this.currentPresure);
		
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.lastPressure = this.currentPresure;
			this.currentPresure = weatherData.getPressure();
			this.display();
		}
		
	}
	
}
