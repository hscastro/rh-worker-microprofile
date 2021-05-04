package com.hscastro.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.hscastro.entities.Worker;
import com.hscastro.services.WorkerService;


@RequestScoped
@Path("workers")
public class WorkerResource {

	@Inject
	WorkerService serviceWorker;
	
	private List<Worker> list = null;	


	@POST
	public Response createWorker(Worker worker) {
		serviceWorker.save(worker);
		return Response.ok().build();
	}
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getWorkers() {
		list = serviceWorker.findAll();
		return Response.ok(list).build();
	}
	
	@GET	
	@Path("{id}")		
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getWorker(@PathParam("id") Long id) {
		Worker worker = serviceWorker.findById(id);
		
		return Response.ok().entity(worker).build();
	}	

	@GET	
	@Path("/{nome}")		
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getWorkerName(@QueryParam("nome") String nome) {
		Worker worker = serviceWorker.findByName(nome);
		
		return Response.ok().entity(worker).build();
	}	
	
	@PUT
    @Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") Long id, Worker worker) {
		Worker updateWorker = serviceWorker.findById(id);
		
		if(updateWorker != null) {
			updateWorker = serviceWorker.update(id, updateWorker);
		}

        return Response.ok().entity(updateWorker).build();
    }	
	
	@GET
	@Path("test")	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response getTest() {
		return Response.ok("Hello, microporfile").build();
	}

	
}