package org.mql.dp.structural.adapter.sample;

public class Client {

	public Client() {
		exp01();
	}
	
	public void exp01() {
		Object result[] = {
			new A(),
			new A(),
			new B(),
			new C(),
			new B(),
			new B(),
			new C()
		};
		
		for (Object target : result) {
			if (target instanceof A) {
				((A)target).sortByTitle();
			} else if (target instanceof B) {
				((B)target).sortByName();
			} else if (target instanceof C) {
				((C)target).sortById();
			}
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
