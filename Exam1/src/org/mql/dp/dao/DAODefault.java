package org.mql.dp.dao;

import java.util.List;
import java.util.Vector;

import org.mql.dp.adapter.Target;
import org.mql.dp.models.Document;

public class DAODefault implements DAO{
	private Target target;
	private List<Document> list;
	
	private static DAODefault instance = new DAODefault();
	
	public DAODefault() {
	}
	
	public DAODefault(Target target) {
		this.target = target;
		list = target.data();
	}

	public String[][] documents() {
		return null;
	}

	public static DAODefault getInstance() {
		return instance;
	}
}
