package org.mql.dp.creational.builder.sample;

import javax.swing.JFrame;

public class Director {

	public Director(Builder builder) {
		builder.readData();
		builder.sortData();
		builder.createComponent();
		JFrame f = builder.getResult();
		f.setVisible(true);
	}
}
