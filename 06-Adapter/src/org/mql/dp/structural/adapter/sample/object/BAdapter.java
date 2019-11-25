package org.mql.dp.structural.adapter.sample.object;

import org.mql.dp.structural.adapter.sample.B;
import org.mql.dp.structural.adapter.sample.Target;

public class BAdapter implements Target {
	private B b;
	public BAdapter(B b) {
		this.b = b;
	}

	public void sort() {
		b.sortByName();
	}
}
