package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source2Adapter implements Target {
	private Source2 source2;
	
	public Source2Adapter(Source2 source2) {
		this.source2 = source2;
	}
	
	public Vector<Document> data() {
		return source2.getData();
	}
}
