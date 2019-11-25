package org.mql.dp.structural.composite.sample4;

import org.mql.dp.structural.composite.Component;
import org.mql.dp.structural.composite.Composite;
import org.mql.dp.structural.composite.Leaf;

public class Client {
	public Client() {
		exp01();
	}
	
	public void exp01() {
		Component c = build(5);
		c.operation();
	}
	
	public Component build(int size) {

			double ran = Math.random();
			if (ran > 0.5) {
				return new Leaf("" + (char)('A' + size));
			} else {
				System.out.println(ran);
				Composite cmp = new Composite("" + (char)('A' + size));
				double randomDouble = Math.random();
				randomDouble = randomDouble * size;
				int randomInt = (int) randomDouble;
				for (int i = 0; i < randomInt; i++) {
					System.out.println(randomInt);
					cmp.add(build(randomInt));
				}
				return cmp;
			}
	}

	public static void main(String[] args) {
		new Client();
	}

}
