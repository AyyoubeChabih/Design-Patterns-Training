package org.mql.dp.creational.abstract_factory;

public class Client {

	public Client(AbstractFactory factory) {
		factory.createProductA();
		factory.createProductB();
		factory.createProductB();
		factory.createProductB();
		factory.createProductA();
		factory.createProductC();
		factory.createProductC();
		factory.createProductA();
	}
	
	public static void main(String[] args) {
		new Client(new ConcreteFactory2());
	}
}
