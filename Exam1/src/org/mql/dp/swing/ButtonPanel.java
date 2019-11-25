package org.mql.dp.swing;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	public ButtonPanel(String ...labels) {
		for (int i = 0; i < labels.length; i++) {
			JButton b = new JButton(labels[i]);
			add(b);
		}
	}
	
	public void addActionListener(ActionListener al) {
		for (int i = 0; i < getComponentCount(); i++) {
			((JButton)getComponent(i)).addActionListener(al);
		}
	}

}
