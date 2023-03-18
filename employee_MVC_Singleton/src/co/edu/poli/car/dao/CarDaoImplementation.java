package co.edu.poli.car.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.poli.car.model.Car;
import co.edu.poli.employee.dao.DatabaseConnection;
//import co.edu.poli.employee.model.Employee;

public  class CarDaoImplementation implements CarDao {
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public Car add(Car aut) throws SQLException {
        String query = "insert into car(aut_placa, aut_modelo, aut_color) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, aut.getAut_placa());
        ps.setString(2, aut.getAut_modelo());
        ps.setString(3, aut.getAut_color());
        ps.executeUpdate();
        return aut;
    }

    @Override
    public Car delete(String placa) throws SQLException {
        Car e2 = getCar(placa);
        if (e2 != null) {
            String query = "delete from car where aut_placa =?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, placa);
            ps.executeUpdate();
        }
        return e2;
    }

    public Car getCar(String placa) throws SQLException {
        String query = "select * from car where aut_placa= ?";
        PreparedStatement ps = con.prepareStatement(query);
        Car aut = null;
        ps.setString(1, placa);
        ResultSet rs = ps.executeQuery();
        boolean check = false;
        while (rs.next()) {
            check = true;
            aut = new Car(rs.getString("aut_placa"), rs.getString("aut_modelo"), rs.getString("aut_color"));
        }

        if (check)
            return aut;
        else
            return null;
    }

	@Override
    public List<Car> getCar () throws SQLException {
        String query = "select * from car";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Car> ls = new ArrayList<Car>();

        while (rs.next()) {
            Car aut = new Car(rs.getString("aut_placa"), rs.getString("aut_modelo"), rs.getString("aut_color"));
            ls.add(aut);
        }
        return ls;
    }

   
   
   
    
    public Car update(String placa, Car aut) throws SQLException {
        Car e2 = getCar(placa);
        if (e2 != null);
        {
        	String query = "update car set emp_placa=?, " + " emp_modelo= ? where emp_color = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, aut.getAut_placa());
			ps.setString(2, aut.getAut_modelo());
			ps.setString(3, aut.getAut_color());
			ps.executeUpdate();
		}
        return e2;
        }

	@Override
	public Car getEmployee(String aut) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	


		
	}
		
    

	


