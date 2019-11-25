package org.mql.dp.swing;

import javax.swing.JFrame;

import org.mql.dp.factory_method.TextFieldPanel;

public class Client extends JFrame {

	public Client() {
		DataScroller ds = new DataScroller(new TextFieldPanel("Id", "Titre", "Prix"));
		add(ds);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Client();
	}
}
