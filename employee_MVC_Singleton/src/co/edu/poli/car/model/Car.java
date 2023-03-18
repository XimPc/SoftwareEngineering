package co.edu.poli.car.model;

public class Car {
	
	private String aut_placa;
	private String aut_modelo;
	private String aut_color;
	
	
	
	
	public Car(String aut_placa, String aut_modelo, String aut_color) {
		super();
		this.aut_placa = aut_placa;
		this.aut_modelo = aut_modelo;
		this.aut_color = aut_color;
	}
	
	
	
	
	
	public String getAut_placa() {
		return aut_placa;
	}
	public void setAut_placa(String aut_placa) {
		this.aut_placa = aut_placa;
	}
	public String getAut_modelo() {
		return aut_modelo;
	}
	public void setAut_modelo(String aut_modelo) {
		this.aut_modelo = aut_modelo;
	}
	public String getAut_color() {
		return aut_color;
	}
	public void setAut_color(String aut_color) {
		this.aut_color = aut_color;
	}
	
	@Override
	public String toString() {
		return "Car [aut_placa=" + aut_placa + ", aut_modelo=" + aut_modelo + ", aut_color=" + aut_color + "]";
	}

	
	
}
