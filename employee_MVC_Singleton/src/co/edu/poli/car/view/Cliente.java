package co.edu.poli.car.view;

import java.util.Scanner;

import co.edu.poli.car.controller.CarController;




public class Cliente {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Input placa");
		String txtplaca = s.nextLine();
		System.out.println("Input modelo");
		String txtmodelo = s.nextLine();
		System.out.println("Input color");
		String txtcolor = s.nextLine();
		
		CarController ec= new CarController (txtplaca,txtmodelo,txtcolor);
		
		
		//Car clonecar1 = (Car) ec.cloneObj();

		//clonecar1.setAut_placa("8888");
		//clonecar1.setAut_modelo("x");
		System.out.println("Ingresar Modificación de Placa:");
		String setClonPlaca=s.nextLine();
		
		
		ec.setClonPlaca(setClonPlaca);
		
		System.out.println(ec.getClon());
		
		ec.eventAdd();	
		
		
		System.out.println(ec.eventReadAll());
		
		
		s.close();
	}

}
