package org.mql.dp.structural.adapter.sample.cls;

import org.mql.dp.structural.adapter.sample.B;
import org.mql.dp.structural.adapter.sample.Target;

public class BAdapter extends B implements Target {

	public BAdapter() {
	}

	public void sort() {
		sortByName();
	}
}
