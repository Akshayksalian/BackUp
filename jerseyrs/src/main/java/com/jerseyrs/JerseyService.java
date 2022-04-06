package com.jerseyrs;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")
public class JerseyService {
	
	/*
	 * http://localhost:8080/jerseyrs/rest/message/
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMsg() {
		return "Hello from Jersey";
	}
	
	/*
	 * http://localhost:8080/jerseyrs/rest/message/Akshay
	 */
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMsgUsingParameters(@PathParam("name") String name) {
		return "Hello from Jersey "+name;
	}
}
