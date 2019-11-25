package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source2 {
	private Vector<Document> documents;
	
	public Source2() {
		documents.add(new Document(1, "JSF", 111));
		documents.add(new Document(2, "Spring", 222));
		documents.add(new Document(3, "Angular", 333));
	}

	public Vector<Document> getData() {
		return documents;
	}
}
