package com.priya.jaxrs.priya;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageService {
	private static final String FILE_PATH = "C:\\Users\\Pawan kumar\\Pictures\\Moto G2\\Bangalore\\IMG_20160424_202252924.png";

	@GET
	@Path("/get")
	@Produces("image/png")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=IMG_20160424_202252924.png");
		return response.build();
	}

}
