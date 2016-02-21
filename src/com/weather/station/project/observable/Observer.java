package com.weather.station.project.observable;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
