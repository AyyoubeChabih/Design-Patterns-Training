package org.mql.dp.creational.builder.sample;

import javax.swing.JFrame;

public interface Builder {
	public void readData();
	public void sortData();
	public void createComponent();
	public JFrame getResult();
}
