package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source3 {
	private Vector<Document> documents;
	
	public Source3() {
		documents.add(new Document(1, "JQuery", 121));
		documents.add(new Document(2, "Node JS", 344));
		documents.add(new Document(3, "BI", 267));
	}

	public Vector<Document> select() {
		return documents;
	}
}
