package mql.org.dp.creational.factory_method.sample;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

/*
 *  ConcreteCreator
 */

public class CheckBoxPanel extends AbstractButtonPanel {
	
	public CheckBoxPanel() {
		super();
	}

	public CheckBoxPanel(String... labels) {
		super(labels);
	}

	public AbstractButton createButton(String label) {
		return new JCheckBox(label);
	}

}
