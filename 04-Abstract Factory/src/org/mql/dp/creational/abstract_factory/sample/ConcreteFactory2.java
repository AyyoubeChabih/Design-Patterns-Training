package org.mql.dp.creational.abstract_factory.sample;

import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ConcreteFactory2 implements AbstractFactory {

	public ConcreteFactory2() {
	}

	public JPanel createTextComponent(String label, int size) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel(label + " : "));
		p1.add(new JScrollPane(new TextArea(3, size)));
		return p1;
	}

	public JComponent createDataList(Object[][] data) {
		String[] titles = new String[data[0].length];
		for (int i = 0; i < titles.length; i++) {
			titles[i] = "" + (char)('A' + i);
		}
		return new JScrollPane(new JTable(data, titles));
	}

	public JPanel createChoiceList(String label, String... choices) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel(label + " : "));
		ButtonGroup g1 = new ButtonGroup();
		for (int i = 0; i < choices.length; i++) {
			JRadioButton b1 = new JRadioButton(choices[i]);
			p1.add(b1);
			g1.add(b1);
		}
		return p1;
	}
}
