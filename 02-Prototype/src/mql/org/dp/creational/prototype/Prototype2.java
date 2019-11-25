package mql.org.dp.creational.prototype;


public class Prototype2 implements Cloneable {
	private int id;
	private String name;
	private Date date;
	
	private static Prototype2 prototype = new Prototype2(10, "Prototype2", new Date());
	
	private Prototype2() {
		System.out.println(">> Const Prtotype()");
	}

	private Prototype2(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		System.out.println(">> Const Prtotype(int id, String name, Date date)");
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Prototype2 clone() {
		try {
			Prototype2 p = (Prototype2)super.clone();
			p.date = this.date.clone();
			return p;
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			return null;
		}
	}

	public String toString() {
		return "Prototype2 [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	public static Prototype2 newInstance() {
		return prototype.clone();
	}
}
