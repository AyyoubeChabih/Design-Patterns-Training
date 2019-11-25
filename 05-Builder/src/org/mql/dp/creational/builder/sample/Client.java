package org.mql.dp.creational.builder.sample;

public class Client {

	public Client() {
		exp02();
	}
	
	public void exp01() {
		new Director(new ConcreteBuilder1());
	}

	public void exp02() {
		new Director(new ConcreteBuilder2("resources/data.txt"));
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
