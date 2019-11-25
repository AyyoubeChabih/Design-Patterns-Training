package org.mql.dp.structural.composite.sample1;

import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class Client {

	public Client() {
		exp01();
	}
	
	public void exp01() {
		Composite e = new Composite("E");
		e.add(new Leaf("F"));
		Composite g = new Composite("G");
		g.add(new Leaf("I"));
		Composite b = new Composite("B");
		b.add(new Leaf("D"));
		b.add(e);
		Composite c = new Composite("C");
		c.add(g);		
		c.add(new Leaf("H"));
		Composite a = new Composite("A");
		a.add(b);
		a.add(c);
		
		a.operation();
	}

	public static void main(String[] args) {
		new Client();
	}
}
