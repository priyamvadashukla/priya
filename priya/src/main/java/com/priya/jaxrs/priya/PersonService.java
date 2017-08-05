package com.priya.jaxrs.priya;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/person2")
public class PersonService
{
	@GET
	@Path("/query")
	public Response getPersons(
	@QueryParam("from") int from,
	@QueryParam("to") int to,
	@QueryParam("orderBy") List&lt;String&gt; orderBy) {

	return Response
	  .status(200)
	  .entity("getPersons is called, from : " + from + ", to : " + to
	+ ", orderBy" + orderBy.toString()).build();

	 }

}