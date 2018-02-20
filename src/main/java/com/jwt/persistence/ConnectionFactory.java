package com.jwt.persistence;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection getConnection() throws URISyntaxException, SQLException {
		String dbUrl = System.getenv("jdbc:postgres://lrspdxwbhbzgtk:7dc1f2651cd4f7a25d3993aa3e971b010ec6e8dc9961c1641460c469271102b7@ec2-79-125-110-209.eu-west-1.compute.amazonaws.com:5432/d9r13jlpn5bq9n");
		return DriverManager.getConnection(dbUrl);
	}
}
