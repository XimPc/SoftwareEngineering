package co.edu.poli.builder.model;

public class Client {

	public static void main(String[] args) {

		Director d = new Director();
		
		System.out.println(d.getHouse("33"));
		System.out.println(d.getHouse("h3"));
	}

}
