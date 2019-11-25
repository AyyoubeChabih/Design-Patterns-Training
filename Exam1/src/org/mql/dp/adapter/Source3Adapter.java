package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source3Adapter implements Target {
	private Source3 source3;
	
	public Source3Adapter(Source3 source3) {
		this.source3 = source3;
	}
	
	public Vector<Document> data() {
		return source3.select();
	}
}
