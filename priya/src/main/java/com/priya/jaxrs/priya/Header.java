package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/header")
public class Header {
	@GET
	@Path("/get")
	public Response getPerson(@HeaderParam("person-agent") String personAgent) {

		return Response.status(200).entity("getPerson is called, personAgent : " + personAgent).build();

	}
}
