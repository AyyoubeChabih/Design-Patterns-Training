package org.mql.dp.structural.adapter.sample.cls;

import org.mql.dp.structural.adapter.sample.C;
import org.mql.dp.structural.adapter.sample.Target;

public class CAdapter extends C implements Target {

	public CAdapter() {
	}

	public void sort() {
		sortById();
	}
}
