package mql.org.dp.creational.factory_method.sample;

import javax.swing.AbstractButton;
import javax.swing.JButton;

/*
 *  ConcreteCreator
 */

public class ButtonPanel extends AbstractButtonPanel {

	public ButtonPanel() {
		super();
	}
	
	public ButtonPanel(String... labels) {
		super(labels);
	}
	
	public AbstractButton createButton(String label) {
		return new JButton(label);
	}

}
