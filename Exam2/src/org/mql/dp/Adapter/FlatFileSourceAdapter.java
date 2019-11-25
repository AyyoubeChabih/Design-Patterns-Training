package org.mql.dp.Adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class FlatFileSourceAdapter implements Target {
	private FlatFileSource ffs;
	
	public FlatFileSourceAdapter() {
	}
	
	public FlatFileSourceAdapter(FlatFileSource ffs) {
		this.ffs = ffs;
	}

	public Vector<Document> data() {
		return ffs.getData();
	}

}
