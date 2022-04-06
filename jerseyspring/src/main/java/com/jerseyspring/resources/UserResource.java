package com.jerseyspring.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.jerseyspring.entities.User;
import com.jerseyspring.service.UserService;

@Path("/user")
public class UserResource {

	@Autowired
	private UserService userService;

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public User getUserById(@PathParam("id") int id) {
		return userService.findUserById(id);
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}

	@POST
//	@Path("/user")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addResponse(User user) {
		userService.addUser(user);
		return Response.status(Status.CREATED).entity(user).build();
	}

	@PUT
	@Path("/user")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateResponse(User user) {
		User u = userService.updateUser(user);
		return Response.status(Status.OK).entity(u).build();
	}

	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteResponse(@PathParam("id") int id) {
		userService.deleteUser(id);
		return Response.status(Status.OK).entity("Deleted Succesfuly").build();
	}
}
