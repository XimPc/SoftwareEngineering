package co.edu.poli.builder.model;

public class Pool {

		public Pool(int alto, int ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
		int alto;
		int ancho;
		public int getAlto() {
			return alto;
		}
		public void setAlto(int alto) {
			this.alto = alto;
		}
		public int getAncho() {
			return ancho;
		}
		public void setAncho(int ancho) {
			this.ancho = ancho;
		}
		
		
		 public String toString() {
		return " [alto=" + alto + ", ancho=" + ancho + "]";
		}

		
	}
	


