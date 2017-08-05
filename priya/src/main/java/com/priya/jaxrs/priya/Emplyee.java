package com.priya.jaxrs.priya;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
@Path("/employees")
public class Emplyee 
{
	//@Path("/employees")
			@GET
			public Response getEmployees(
			        @DefaultValue("2002") @QueryParam("minyear") int minyear,
			        @DefaultValue("2010") @QueryParam("maxyear") int maxyear)
			    {
					return getEmployees(1990, 2009);
		
			    }
}
