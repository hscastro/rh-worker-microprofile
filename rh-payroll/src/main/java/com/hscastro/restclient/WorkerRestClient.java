package com.hscastro.restclient;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hscastro.entities.Worker;

@Path("payments")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface WorkerRestClient {
	
	@GET
	@Path("/{id}")	
	Worker findById(@PathParam("id") Long id);	
	
}