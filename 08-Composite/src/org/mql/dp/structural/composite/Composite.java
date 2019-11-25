package org.mql.dp.structural.composite;

import java.util.Vector;

public class Composite extends Component {
	private Vector<Component> children;
	public Composite() {
		children = new Vector<Component>();
	}
	
	public Composite(String name) {
		super(name);
		children = new Vector<Component>();
	}
	
	public void operation(String margin) {
		System.out.println(margin + "<" + getName() + ">");
		for (Component child : children) {
			child.operation(margin + "++");
		}
	}
	
	public void add(Component cmp) {
		children.add(cmp);
	}
	
	public void remove(Component cmp) {
		children.remove(cmp);
	}
	
	public Component get(int index) {
		return children.get(index);
	}
	
	public int size() {
		return children.size();
	}

}
