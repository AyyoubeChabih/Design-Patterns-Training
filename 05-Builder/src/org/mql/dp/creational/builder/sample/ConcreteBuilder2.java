package org.mql.dp.creational.builder.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ConcreteBuilder2 implements Builder {
	private String source;
	private String[][] data;
	private JComponent result;
	private int column = 1;
	
	public ConcreteBuilder2(String source) {
		this.source = source;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void readData() {
		Vector<String[]> v = new Vector<String[]>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			String row = in.readLine();
			while (row != null) {
				v.add(row.split(","));
				row = in.readLine();
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
		}
		data = new String[v.size()][v.get(0).length];
		for (int i = 0; i < data.length; i++) {
			data[i] = v.get(i);
		}
	}

	public void sortData() {
		for (int i = 0; i < data.length-1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j][column].compareTo(data[maxIndex][column]) < 0) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				String[] tmp = data[i];
				data[i] = data[maxIndex];
				data[maxIndex] = tmp;				
			}
		}
	}

	public void createComponent() {
		String[] titles = new String[data[0].length];
		for (int i = 0; i < titles.length; i++) {
			titles[i] = "" + (char)('A' + i);
		}
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
