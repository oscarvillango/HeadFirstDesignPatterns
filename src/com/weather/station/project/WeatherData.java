package com.weather.station.project;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registrerObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		int i = 0; 
		i = observers.indexOf(o);
		
		if(0 >= i){
			observers.remove(i);
		}
		
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

	public void measurementsChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurements(float temp, float humid, float press){
		this.temperature = temp;
		this.humidity = humid;
		this.pressure = press;
		
		this.measurementsChanged();
	}

}
