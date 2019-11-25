package org.mql.dp.factory_method;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

abstract public class AbstractTextPanel extends JPanel {

	public AbstractTextPanel() {
	}
	
	public AbstractTextPanel(String ...labels) {
		for (int i = 0; i < labels.length; i++) {
			JPanel p = new JPanel();
			p.setLayout(new FlowLayout(FlowLayout.LEFT));
			JLabel l = new JLabel(labels[i] + " : ");
			p.add(l);
			p.add(createText());
			add(p);
		}
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	}

	abstract JComponent createText();
}
