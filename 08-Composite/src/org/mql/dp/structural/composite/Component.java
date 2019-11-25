package org.mql.dp.structural.composite;

abstract public class Component {
	private String name;
	
	public Component() {
	}

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void operation() {
		operation("");
	}
	
	abstract public void operation(String margin);
}
