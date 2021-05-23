package com.hscastro.restclient;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hscastro.entities.Worker;

@Path("workers")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface WorkerRestClient {
	
	@GET				
	Worker findById(@PathParam("id") Long id);	
	
	@GET				
	List<Worker> findAll();
	
}
