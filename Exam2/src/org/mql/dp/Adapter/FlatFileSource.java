package org.mql.dp.Adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class FlatFileSource {
	private Vector<Document> documents;
	
	public FlatFileSource() {
		documents = new Vector<Document>();
		documents.add(new Document(1, "JQuery", 121));
		documents.add(new Document(2, "Node JS", 344));
		documents.add(new Document(3, "BI", 267));
	}

	public Vector<Document> getData() {
		return documents;
	}
}
