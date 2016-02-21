package com.weather.station.project.observable;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float temp, float humid, float press){
		this.setTemperature(temp);
		this.setHumidity(humid);
		this.setPressure(press);
		
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
