package org.mql.dp.factory_method;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class TextFieldPanel extends AbstractTextPanel {

	public TextFieldPanel() {
		super();
	}

	public TextFieldPanel(String ...labels) {
		super(labels);
	}

	JComponent createText() {
		return new JTextField("", 20);
	}

}
