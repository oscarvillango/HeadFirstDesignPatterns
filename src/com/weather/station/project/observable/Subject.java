package com.weather.station.project.observable;

public interface Subject {
	public void registrerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
