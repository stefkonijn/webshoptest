package com.jwt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

import com.jwt.domain.Category;
import com.jwt.domain.Product;

@Path("/hello")
public class HelloWorldService {
	// test1

	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name) {
		Category category = new Category("computers");
		Product product = new Product(name, category, 20.99);
		System.out.println("hey");
		System.out.println(product.getName());
		category.addProduct(product);
		String jsonString = new JSONObject().put("productname", name)
				.put("price", product.getPrice())
				.put("category", category.getName()).toString();
		return Response.status(200).entity(jsonString).build();

	}

}