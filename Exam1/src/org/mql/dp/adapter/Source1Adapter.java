package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source1Adapter implements Target {
	private Source1 source1;
	
	public Source1Adapter(Source1 source1) {
		this.source1 = source1;
	}
	
	public Vector<Document> data() {
		return source1.get();
	}
}
