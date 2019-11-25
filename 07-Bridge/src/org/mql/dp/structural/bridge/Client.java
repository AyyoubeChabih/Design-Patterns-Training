package org.mql.dp.structural.bridge;

public class Client {

	public Client() {
		exp01();
		exp02();
	}

	public void exp01() {
		Abstraction a = new RefinedAbstraction1(new ConcreteImplementorB());
		a.operation();
	}
	
	public void exp02() {
		Abstraction a = new RefinedAbstraction2(new ConcreteImplementorA());
		a.operation();
	}	
	
	public static void main(String[] args) {
		new Client();
	}
}
