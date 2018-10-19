package com.ptop.designpattern.observer;

import org.junit.Test;

public class WeatherDataTest {
	@Test
	public void test() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurement(80, 65, 30.4f);
		weatherData.setMeasurement(82, 70, 29.2f);
		weatherData.setMeasurement(78, 90, 29.2f);
	}
}