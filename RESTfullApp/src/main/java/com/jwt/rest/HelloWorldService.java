package com.jwt.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
@Path("/hello")
public class HelloWorldService {
  
    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
  
        String output = "Welcome   : " + name;
        String jsonString = new JSONObject()
                .put("name", name)
                .put("age", 18)
                .put("jsonarray2", new JSONObject()
                     .put("key1", "value1")).toString();
        return Response.status(200).entity(jsonString).build();
  
    }
  
}