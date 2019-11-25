package org.mql.dp.structural.adapter.sample.object;

import org.mql.dp.structural.adapter.sample.A;
import org.mql.dp.structural.adapter.sample.Target;

public class AAdapter implements Target{
	private A a;
	
	public AAdapter(A a) {
		this.a = a;
	}

	public void sort() {
		a.sortByTitle();
	}

}
