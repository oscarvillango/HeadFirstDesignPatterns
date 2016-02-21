package com.weather.station.project;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
