package co.edu.poli.builder.model;

public class Director {

	public House getHouse (String typeHouse) {
		
		House h;
		
        Pool Piscina = new Pool (10,20);
        
		
		
		
		if (typeHouse.equals("h1")) {
			h = new House.Builder()
					.withType("apto")
					.withCeil(null)
					.withFloor(null)
					.withDoor(null)
					.withWindow(null)
					.withPool(Piscina)
					.build();
		} else {
			h = new House.Builder()
					.withType("house")
					.withCeil(null)
					.withFloor(null)
					.withDoor(null)
					.withWindow(null)
					.withGarden(null)
					.build();
		}
			
		return h;
	}
	
}
