package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("some")
@Produces(MediaType.TEXT_PLAIN)
public class Some 
{
@GET
public String dogetasplaintext() 
{
	return "dont worry about future";
}
}
