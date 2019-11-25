package mql.org.dp.creational.factory_method.sample;

import javax.swing.JFrame;

public class Client extends JFrame {

	public Client() {
		exp03();
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void exp01() {
		AbstractButtonPanel p = new ButtonPanel("Singleton", "Prototype", "Factory Method");
		getContentPane().add(p);
	}
	
	public void exp02() {
		AbstractButtonPanel p = new CheckBoxPanel("Singleton", "Prototype", "Factory Method");
		getContentPane().add(p);
	}
	
	public void exp03() {
		AbstractButtonPanel p = new RadioButtonPanel("Singleton", "Prototype", "Factory Method");
		getContentPane().add(p);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
