package co.edu.poli.car.dao;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.car.model.Car;



public interface CarDao {
    public Car add(Car aut)
            throws SQLException;
        
        public Car delete(String aut)
            throws SQLException;
        
        public Car getEmployee(String aut)
            throws SQLException;
        
        public List<Car> getCar()
            throws SQLException;
        
        public Car update(String placa, Car aut)
            throws SQLException;

		Car getCar(String placa) throws SQLException;
	
}
