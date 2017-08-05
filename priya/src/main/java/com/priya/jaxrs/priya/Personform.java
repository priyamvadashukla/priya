package com.priya.jaxrs.priya;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hellomylove")
public class Personform 
{
	@POST
	@Path("/add")
	public Response addPerson(
	@FormParam("name") String name,
	@FormParam("age") int age) {

	return Response.status(200)
	.entity("addPerson is called, name : " + name + ", age : " + age)
	.build();
	}
}
