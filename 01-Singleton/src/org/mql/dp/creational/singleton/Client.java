package org.mql.dp.creational.singleton;

import java.awt.Toolkit;

public class Client {
	
	public Client() {
		KnownUses();
	}

	public void exp01() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
	
	public void KnownUses() {
		Toolkit tk1 = Toolkit.getDefaultToolkit(); // singleton basé sur abstraction une instance car elle est utilisé dans un seul OS
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		
		System.out.println(tk1);
		System.out.println(tk2);
		System.out.println(tk1 == tk2);
		
		System.out.println(tk1.getScreenSize());
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
