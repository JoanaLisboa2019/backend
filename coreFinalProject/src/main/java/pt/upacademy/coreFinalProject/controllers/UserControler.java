package pt.upacademy.coreFinalProject.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.models.User;
import pt.upacademy.coreFinalProject.models.DTOS.UserDTO;
import pt.upacademy.coreFinalProject.services.UserService;

@Path("users")
@RequestScoped
public class UserControler extends EntityControler {
	
	@Inject
	protected UserService service;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "No data";
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String create(UserDTO user) {
		service.createUser(user);
		return user.getUsername();
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String delete() {
		return "delete not implemented";
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String update(User user) {
		return user.getEmail();
	}
}
