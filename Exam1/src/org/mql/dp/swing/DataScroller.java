package org.mql.dp.swing;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.mql.dp.factory_method.AbstractTextPanel;

public class DataScroller extends JPanel {
	private AbstractTextPanel p;
	
	public DataScroller(AbstractTextPanel p) {
		this.p = p;
		init();
	}

	public void init() {
		ButtonPanel bp = new ButtonPanel("Début", "Précédent", "Suivant", "Fin");
		setLayout(new BorderLayout());
		add(bp, BorderLayout.SOUTH);
		add(p, BorderLayout.CENTER);
	}
}
