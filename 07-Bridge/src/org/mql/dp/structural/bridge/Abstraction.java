package org.mql.dp.structural.bridge;

public class Abstraction {
	private Implementor imp;
	
	public Abstraction(Implementor imp) {
		this.imp = imp;
	}

	public void setImp(Implementor imp) {
		this.imp = imp;
	}

	public void operation() {
		imp.operationImp();
	}
}
