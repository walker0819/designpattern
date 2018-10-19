package com.ptop.designpattern.observer;

import java.util.Observable;

/**
 * 使用JDK内置的支持
 */
public class WeatherData extends Observable {
	//    private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData() {

	}

	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurement(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
