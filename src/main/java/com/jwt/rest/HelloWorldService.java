package com.jwt.rest;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.jwt.domain.Category;
import com.jwt.domain.Customer;
import com.jwt.domain.Product;
import com.jwt.persistence.CustomerDAO;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{name}")
	@Produces("application/json")
	public Response getMsg(@PathParam("name") String name) {
		CustomerDAO customerDao = new CustomerDAO();
		ArrayList<Customer> customers = null;
		try {
			customers = customerDao.allCustomers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		JsonObjectBuilder job = Json.createObjectBuilder();
		JsonArrayBuilder jab = Json.createArrayBuilder();
		for (Customer customer : customers) {
			job.add("lastname", customer.getLastname()).add("name", customer.getName())
					.add("adress", customer.getAdress().getStreet())
					.add("streetnumber", customer.getAdress().getStreetnumber()).toString();
			jab.add(job);
		}

		return Response.status(200).entity(jab.build().toString()).build();

	}

}