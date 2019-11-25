package org.mql.dp.structural.adapter.sample.object;

import org.mql.dp.structural.adapter.sample.C;
import org.mql.dp.structural.adapter.sample.Target;

public class CAdapter implements Target {
	private C c;
	public CAdapter(C c) {
		this.c = c;
	}

	public void sort() {
		c.sortById();
	}
}
