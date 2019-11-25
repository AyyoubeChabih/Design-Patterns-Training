package org.mql.dp.structural.composite;

public class Leaf extends Component {

	public Leaf() {
	}
	
	public Leaf(String name) {
		super(name);
	}

	public void operation(String margin) {
		System.out.println(margin + "|" + getName() + "|");
	}

}
