package mql.org.dp.creational.factory_method.sample;

import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

public class RadioButtonPanel extends AbstractButtonPanel {

	public RadioButtonPanel() {
		super();
	}

	public RadioButtonPanel(String... labels) {
		super(labels);
	}

	public AbstractButton createButton(String label) {
		return new JRadioButton(label);
	}

}
