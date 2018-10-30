package com.ptop.designpattern.factory;

/**
 * 工厂方法
 * @author josh
 */
public abstract class BaseFactory {
	
	public Product order(String type){
		Product product;
		product = factoryMethod(type);
		//other business operate
		return product;
	}

	protected abstract Product factoryMethod(String  type);
}
