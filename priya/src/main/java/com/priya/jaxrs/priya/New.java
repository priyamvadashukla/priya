package com.priya.jaxrs.priya;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/new")
public class New
{
@POST
@Produces(MediaType.TEXT_PLAIN)
public String hiji() 
{
	return "hello";
}
}
