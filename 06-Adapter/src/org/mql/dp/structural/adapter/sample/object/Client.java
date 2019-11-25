package org.mql.dp.structural.adapter.sample.object;

import org.mql.dp.structural.adapter.sample.A;
import org.mql.dp.structural.adapter.sample.B;
import org.mql.dp.structural.adapter.sample.C;
import org.mql.dp.structural.adapter.sample.Target;

public class Client {

	public Client() {
		exp01();
	}
	
	public void exp01() {
		Target result[] = {
			new AAdapter(new A()),
			new AAdapter(new A()),
			new BAdapter(new B()),
			new CAdapter(new C()),
			new BAdapter(new B()),
			new BAdapter(new B()),
			new CAdapter(new C())
		};
		
		for (Target target : result) {
			target.sort();
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
