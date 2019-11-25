package org.mql.dp.structural.adapter.sample.cls;

import org.mql.dp.structural.adapter.sample.Target;

public class Client {

	public Client() {
		exp01();
	}
	
	public void exp01() {
		Target result[] = {
			new AAdapter(),
			new AAdapter(),
			new BAdapter(),
			new CAdapter(),
			new BAdapter(),
			new BAdapter(),
			new CAdapter()
		};
		
		for (Target target : result) {
			target.sort();
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
