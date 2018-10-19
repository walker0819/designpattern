package com.ptop.designpattern.observer;

/**
 * 主题
 */
public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
