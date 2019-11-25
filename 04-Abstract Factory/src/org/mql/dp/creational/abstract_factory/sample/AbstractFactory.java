package org.mql.dp.creational.abstract_factory.sample;

import javax.swing.JComponent;
import javax.swing.JPanel;

public interface AbstractFactory {
	public JPanel createTextComponent(String label, int size);
	public JComponent createDataList(Object[][] data);
	public JPanel createChoiceList(String label, String... choices);
}
