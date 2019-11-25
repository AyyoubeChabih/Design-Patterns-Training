package org.mql.dp.creational.abstract_factory;

public class ConcreteFactory1 implements AbstractFactory {

	public ConcreteFactory1() {
	}

	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}

	public AbstractProductC createProductC() {
		return new ProductC1();
	}

}
