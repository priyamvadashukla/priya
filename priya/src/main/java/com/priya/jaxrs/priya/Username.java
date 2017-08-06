package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user/{username}/{gh2}/")

public class Username {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hellometh() {
		return "my birthday date is 9 Aug";
	}
}
