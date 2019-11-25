package org.mql.dp.Adapter;

import java.util.Vector;

import org.mql.dp.models.Document;

public class MemorySource {
	private Vector<Document> documents;
	
	public MemorySource() {
		documents = new Vector<Document>();
		documents.add(new Document(1, "JavaEE", 111));
		documents.add(new Document(2, "JavaScript", 111));
		documents.add(new Document(3, "Struts2", 111));
	}

	public Vector<Document> select() {
		return documents;
	}
	
}
