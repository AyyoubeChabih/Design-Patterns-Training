package mql.org.dp.creational.prototype;

public class Client {
	
	public Client() {
		exp02();
	}

	private void exp01() {
		Prototype p1 = new Prototype(10, "Prototype");
		Prototype p2 = p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 == p2 : " + (p1 == p2));
		p2.setName("Nouvelle instance");
		System.out.println(p1);
		System.out.println(p2);
	}
	
	public void exp02() {
		Prototype2 p1 = Prototype2.newInstance();
		Prototype2 p2 = Prototype2.newInstance();
		Prototype2 p3 = Prototype2.newInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p2.setDate(new Date(12, 5, 2017));
		
		System.out.println("***********************");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		p1.getDate().setYear(2020);
		
		System.out.println("***********************");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
