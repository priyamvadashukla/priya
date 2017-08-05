package com.priya.jaxrs.priya;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hi() 
	{
		return "hi";
	}
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    	public String  getUser(){
    		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey love you" + "</hello>"; 
    	}*/
   /* @GET
    @Path("/{param}")
    public Response getmessage(@PathParam("param")String mesg) 
    {
    	String output="hello miss priya"+mesg;
		return Response.status(200).entity(output).build();
    	
    }*/
	
   /* @Path("a")
    class A
    {
    	@GET
    	@Produces(MediaType.TEXT_PLAIN)
    	public String getlove() {
    		return "hello my love";
    	}*/
    }
    

