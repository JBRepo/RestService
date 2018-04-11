package com.react.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/Event")
public class EventController{
	@GET
	@Path("/{name}")	
	public Response test(@PathParam("name") String name){
		String output =  "<html lang=\"en\"><body><h1>Hello, World!!</body></h1></html>";
		return Response.status(200).entity(output).build();
	}
}
