package org.mql.dp.models;

public class Document {
	private int id;
	private String titre;
	private double price;
	
	public Document() {
	}

	public Document(int id, String titre, double price) {
		super();
		this.id = id;
		this.titre = titre;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", titre=" + titre + ", price=" + price + "]";
	}

	
}
