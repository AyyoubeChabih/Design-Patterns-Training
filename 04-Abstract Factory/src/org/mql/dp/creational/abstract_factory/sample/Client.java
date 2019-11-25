package org.mql.dp.creational.abstract_factory.sample;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame {
	private static final long serialVersionUID = 1L;

	public Client(AbstractFactory factory) {
		JPanel content = new JPanel(new BorderLayout());
		content.add("North", factory.createTextComponent("Design Pattern", 30));
		Object[][] data = {
				{"Abstract Factory", "Creational", 4},
				{"Builder", "Creational", 5},
				{"Bridge", "Structural", 2},
				{"Chain of Responsibility", "Behavioral", 1},
				{"Proxy", "Structural", 7}
		};
		content.add("Center", factory.createDataList(data));
		content.add("South", factory.createChoiceList("Category", "Creational", "Structural", "Behavioral"));
		setContentPane(content);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Client(new ConcreteFactory2());
	}
}
