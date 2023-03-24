package co.edu.poli.car.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.car.dao.CarDao;
import co.edu.poli.car.dao.CarDaoImplementation;
import co.edu.poli.car.model.Car;

public class CarController {

    Car e2;
    CarDao edao2;
    
    Car Clon;
   

	
    

    public CarController(String placa, String modelo, String color) {
        e2 = new Car(placa, modelo, color);
        edao2 = new CarDaoImplementation();
    	
		Clon = (Car) e2.cloneObj();
    }
    
    public Car getClon() {
		return Clon;
	}



	public void setClonPlaca(String placa) {
		Clon.setAut_placa(placa);
	}
   

    public Car eventAdd() {
        try {
            return edao2.add(e2);
        } catch (SQLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Car eventRead(String placa) {
        try {
            return edao2.getCar(placa);
        } catch (SQLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public List<Car> eventReadAll() {
        try {
            return edao2.getCar();
        } catch (SQLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Car eventUpdate(String placa, Car aut) {
        try {
            return edao2.update(placa, aut);
        } catch (SQLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Car eventDelete(String placa) {
        try {
            return edao2.delete(placa);
        } catch (SQLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

 

}
