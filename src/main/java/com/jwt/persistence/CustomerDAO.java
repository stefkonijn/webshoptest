package com.jwt.persistence;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jwt.domain.Adress;
import com.jwt.domain.Customer;

public class CustomerDAO {

	private ConnectionFactory connFactory = new ConnectionFactory();
	private Connection conn;

	public ArrayList<Customer> allCustomers() throws SQLException, ClassNotFoundException {
		conn = connFactory.getConnection();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Customer");
		while (rs.next()) {
			Adress adress = new Adress(rs.getString("adress"), rs.getInt("streetnumber"));
			Customer customer = new Customer(rs.getString("firstname"), rs.getString("lastname"), adress);
			customers.add(customer);
		}
		// Adress adress = new Adress("Stromenlaan", 155);
		// Customer customer = new Customer("Sten", "Terwan", adress);
		// customers.add(customer);
		return customers;
	}
}
