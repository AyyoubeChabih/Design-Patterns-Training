package org.mql.dp.creational.abstract_factory;

public class ConcreteFactory2 implements AbstractFactory {

	public ConcreteFactory2() {
	}

	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}

	public AbstractProductC createProductC() {
		return new ProductC2();
	}
}
