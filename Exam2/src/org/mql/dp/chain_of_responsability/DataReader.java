package org.mql.dp.chain_of_responsability;

import java.util.Vector;

import org.mql.dp.Adapter.Target;
import org.mql.dp.models.Document;

public class DataReader implements Handler {
	private Target source;
	private Handler handler;
	
	private static DataReader instance = new DataReader();
	
	public DataReader() {

	}

	public DataReader(Target source) {
		this.source = source;
	}
	
	public String[][] documents() {
		Vector<Document> docs = source.data();
		String[][] s = new String[docs.size()][3];
		for (int i = 0; i < docs.size(); i++) {
			s[i][0] = "" + docs.get(i).getId();
			s[i][1] = docs.get(i).getTitre();
			s[i][2] = "" + docs.get(i).getPrice();
		}
		return s;
	}
	
	public static DataReader getInstance() {
		return instance;
	}

	public void proccess(String[][] documents) {
		if (documents != null) {
			handler.proccess(documents);
		}
	}
}
