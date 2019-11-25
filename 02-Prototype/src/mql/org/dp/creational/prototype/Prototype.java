package mql.org.dp.creational.prototype;

public class Prototype implements Cloneable {
	private int id;
	private String name;
	
	public Prototype() {
		System.out.println(">> Const Prtotype()");
	}

	public Prototype(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println(">> Const Prtotype(int id, String name)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Prototype clone() {
		try {
			return (Prototype)super.clone();
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			return null;
		}
	}

	public String toString() {
		return "Prototype [id=" + id + ", name=" + name + "]";
	}
}
