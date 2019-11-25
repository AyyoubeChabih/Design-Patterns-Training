package org.mql.dp.creational.abstract_factory;

public interface AbstractFactory { // ce DP est bas� sur le DP de structure "Bridge"
	public AbstractProductA createProductA();
	public AbstractProductB createProductB();
	public AbstractProductC createProductC();
}
