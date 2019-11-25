package mql.org.dp.creational.factory_method.sample;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JPanel;

/*
 *  Creator
 */
abstract public class AbstractButtonPanel extends JPanel {

	public AbstractButtonPanel() {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
	
	public AbstractButtonPanel(String ...labels) {
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		for (int i = 0; i < labels.length; i++) {
			AbstractButton b = createButton(labels[i]);
			add(b);
		}
	}
	
	public void addButton(String label) {
		AbstractButton b = createButton(label);
		add(b);
	}
	
	public void addActionListener(ActionListener listener) {
		for (int i = 0; i < getComponentCount(); i++) {
			AbstractButton b = (AbstractButton)getComponent(i);
			b.addActionListener(listener);
		}
	}
	
	abstract public AbstractButton createButton(String label);
}
