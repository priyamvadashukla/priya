package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/persons")
public class PersonRestService 
{
	@GET
	public Response getPerson() {

	return Response.status(200).entity("getPerson is called").build();

	} 

	@GET
	@Path("/vip")
	public Response getPersonVIP() {

	return Response.status(200).entity("getPersonVIP is called").build();

	 }
}
