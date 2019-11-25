package org.mql.dp.factory_method;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class LabelPanel extends AbstractTextPanel {

	public LabelPanel() {
		super();
	}

	public LabelPanel(String ...labels) {
		super(labels);
	}
	
	JComponent createText() {
		return new JLabel();
	}
}
