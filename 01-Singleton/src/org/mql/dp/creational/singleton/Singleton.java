package org.mql.dp.creational.singleton;

public class Singleton {
	private String name;
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}

	private Singleton(String name) {
		super();
		this.name = name;
	}

	public static Singleton getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
