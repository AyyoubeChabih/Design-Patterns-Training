package org.mql.dp.structural.adapter.sample.cls;

import org.mql.dp.structural.adapter.sample.A;
import org.mql.dp.structural.adapter.sample.Target;

public class AAdapter extends A implements Target{

	public AAdapter() {
	}

	public void sort() {
		sortByTitle();
	}

}
