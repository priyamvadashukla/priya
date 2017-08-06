package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/header2")
public class Header2 {
	@GET
	@Path("/get")
	public Response getPerson(@Context HttpHeaders headers) {

		String personAgent = headers.getRequestHeader("person-agent").get(0);

		return Response.status(200).entity("getPerson is called, personAgent : " + personAgent).build();

	}

}
