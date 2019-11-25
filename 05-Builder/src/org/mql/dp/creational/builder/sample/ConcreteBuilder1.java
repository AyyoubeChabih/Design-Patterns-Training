package org.mql.dp.creational.builder.sample;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ConcreteBuilder1 implements Builder {
	private Object[][] data;
	private JComponent result;
	
	public ConcreteBuilder1() {
	}

	public void readData() {
		data = new Object[][] {
			{"Builder", "Creational", 5},
			{"Abstract Factory", "Creational", 4},
			{"Chain of Responsibility", "Behavioral", 13},
			{"Proxy", "Structural", 12},
			{"Bridge", "Structural", 7}
		};
	}

	public void sortData() {
		for (int i = 0; i < data.length-1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if ((int)data[j][2] > (int)data[maxIndex][2]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				Object tmp = data[i];
				data[i] = data[maxIndex];
				data[maxIndex] = (Object[]) tmp;				
			}
		}
	}

	public void createComponent() {
		String[] titles = {"Design Pattern", "Category", "Identifier"};
		result = new JScrollPane(new JTable(data, titles));
	}

	public JFrame getResult() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(result);
		f.pack();
		return f;
	}

}
