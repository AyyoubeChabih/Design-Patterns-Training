package org.mql.dp.Adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class MemorySourceAdapter implements Target {
	private MemorySource ms;
	
	public MemorySourceAdapter() {
	}
	
	public MemorySourceAdapter(MemorySource ms) {
		this.ms = ms;
	}

	public Vector<Document> data() {
		return ms.select();
	}

}
