package org.mql.dp.adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class Source1 {
	private Vector<Document> documents;
	
	public Source1() {
		documents.add(new Document(1, "JavaEE", 111));
		documents.add(new Document(2, "JavaScript", 111));
		documents.add(new Document(3, "Struts2", 111));
	}

	public Vector<Document> get() {
		return documents;
	}
}
