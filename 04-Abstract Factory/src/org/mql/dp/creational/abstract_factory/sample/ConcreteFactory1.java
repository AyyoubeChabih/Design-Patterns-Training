package org.mql.dp.creational.abstract_factory.sample;

import java.awt.FlowLayout;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ConcreteFactory1 implements AbstractFactory {

	public ConcreteFactory1() {
	}

	public JPanel createTextComponent(String label, int size) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel(label + " : "));
		p1.add(new JTextField(size));
		return p1;
	}

	public JComponent createDataList(Object[][] data) {
		String[] list = new String[data.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = Arrays.toString(data[i]);
		}
		return new JScrollPane(new JList<>(list));
	}

	public JPanel createChoiceList(String label, String... choices) {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel(label + " : "));
		p1.add(new JComboBox<>(choices));
		return p1;
	}

}
